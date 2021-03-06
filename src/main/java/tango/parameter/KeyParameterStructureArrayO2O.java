package tango.parameter;

import tango.plugin.measurement.MeasurementStructure;

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

public class KeyParameterStructureArrayO2O extends KeyParameterStructure {
    public KeyParameterStructureArrayO2O(String label, String id, String defaultValue, boolean selected) {
        super(label, id, defaultValue, selected, MeasurementStructure.ArrayO2O);
    }
    public KeyParameterStructureArrayO2O(String label, String id) {
        super(label, id, MeasurementStructure.ArrayO2O);
    }
    
    @Override
    public Parameter duplicate(String newLabel, String newId) {
        return new KeyParameterStructureArrayO2O(newLabel, newId, key.getText(), checkbox.isSelected());
    }
    
    public KeyParameterObjectNumber getKeyParameterObjectNumber() {
        return new KeyParameterObjectNumber(label.getText(), id, key.getText(), this.checkbox.isSelected());
    }
}
