package tango.parameter;

import mcib3d.utils.exceptionPrinter;
import ij.ImagePlus;
import ij.gui.GenericDialog;
import java.awt.event.ActionListener;
import mcib3d.image3d.ImageHandler;
import tango.dataStructure.InputImages;
import tango.gui.Core;
import tango.plugin.PluginFactory;
import tango.plugin.filter.PreFilter;
import tango.plugin.thresholder.Thresholder;
import tango.util.utils;
/**
 *
 **
 * /**
 * Copyright (C) 2012 Jean Ollion
 *
 *
 *
 * This file is part of tango
 *
 * tango is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * @author Jean Ollion
 */
public class PreFilterParameter extends PluginParameter {

    public PreFilterParameter(String label, String id, String defMethod) {
        super(label, id, defMethod);
        initChoice();
    }
    
    public PreFilterParameter(String label, String id, String defMethod, Parameter[] defParameters) {
        super(label, id, defMethod);
        initChoice();
        setContent(currentParameters, defParameters);
    }

    @Override
    public Parameter duplicate(String newLabel, String newId) {
        return new PreFilterParameter(newLabel, newId, utils.getSelectedString(choice));
    }

    @Override
    protected void initChoice() {
        if (PluginFactory.getPreFilterList() == null) {
            return;
        }
        selecting = true;
        choice.addItem(" ");
        for (String s : PluginFactory.getPreFilterList()) {
            choice.addItem(s);
        }
        if (defMethod != null && defMethod.length() > 0) {
            choice.setSelectedItem(defMethod);
            majPanel();
        }
        selecting = false;
    }

    @Override
    protected void getPlugin(String method) {
        plugin = PluginFactory.getPreFilter(method);
    }

    public ImageHandler preFilter(int currentStructureIdx, ImageHandler in, InputImages images, int nbCPUs, boolean verbose) {
        if (plugin == null) {
            return in;
        }
        try {
            PreFilter f = (PreFilter) plugin;
            f.setVerbose(verbose);
            f.setMultithread(nbCPUs);
            ImageHandler res = f.runPreFilter(currentStructureIdx, in, images);
            res.setOffset(in);
            res.setScale(in);
            return res;
        } catch (Exception e) {
            exceptionPrinter.print(e, "", Core.GUIMode);
        }
        return in;
    }

    @Override
    public PreFilter getPlugin(int nCPUs, boolean verbose) {
        if (plugin!=null) return (PreFilter)super.getPlugin(nCPUs, verbose);
        else return null;
    }

    @Override
    public void addToGenericDialog(GenericDialog gd) {
    }
}
