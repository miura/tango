
package tango.gui.util;

import tango.gui.Core;
import tango.gui.NucleusManager;
import tango.gui.PanelDisplayer;
import tango.helper.HelpManager;
import tango.helper.ID;
import tango.helper.RetrieveHelp;

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
public class NucleusManagerLayout extends javax.swing.JPanel {
    NucleusManager nucleusManager;
    public NucleusManagerLayout(NucleusManager nucleusManager) {
        this.nucleusManager=nucleusManager;
        initComponents();
    }
    
    public void toggleIsRunning(boolean isRunning) {
        this.selectAll.setEnabled(!isRunning);
        this.selectNone.setEnabled(!isRunning);
        this.delete.setEnabled(!isRunning);
        this.list.setEnabled(!isRunning);
        this.merge.setEnabled(!isRunning);
        this.revert.setEnabled(!isRunning);
        this.save.setEnabled(!isRunning);
        this.shift.setEnabled(!isRunning);
        if (Core.TESTING) this.split.setEnabled(!isRunning);
        this.runButton.setEnabled(!isRunning);
        viewMask.setEnabled(!isRunning);
        viewRaw.setEnabled(!isRunning);
        viewROIs.setEnabled(!isRunning);
    }
    
    public void registerComponents(HelpManager hm) {
        hm.objectIDs.put(this.selectAll, new ID(RetrieveHelp.manualNucPage, "Select_All"));
        hm.objectIDs.put(this.selectNone, new ID(RetrieveHelp.manualNucPage, "Select_None"));
        hm.objectIDs.put(this.viewMask, new ID(RetrieveHelp.manualNucPage, "ROIs"));
        hm.objectIDs.put(this.viewRaw, new ID(RetrieveHelp.manualNucPage, "Input"));
        hm.objectIDs.put(this.viewROIs, new ID(RetrieveHelp.manualNucPage, "ROIs"));
        hm.objectIDs.put(this.shift, new ID(RetrieveHelp.manualNucPage, "Shift"));
        hm.objectIDs.put(this.delete, new ID(RetrieveHelp.manualNucPage, "Delete"));
        hm.objectIDs.put(this.merge, new ID(RetrieveHelp.manualNucPage, "Merge"));
        hm.objectIDs.put(this.split, new ID(RetrieveHelp.manualNucPage, "Split"));
        hm.objectIDs.put(this.runButton, new ID(RetrieveHelp.manualNucPage, "Threshold"));
        hm.objectIDs.put(this.revert, new ID(RetrieveHelp.manualNucPage, "Revert"));
        hm.objectIDs.put(this.save, new ID(RetrieveHelp.manualNucPage, "Save"));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectionPanel = new javax.swing.JPanel();
        selectAll = new javax.swing.JButton();
        selectNone = new javax.swing.JButton();
        viewPanel = new javax.swing.JPanel();
        viewMask = new javax.swing.JButton();
        viewRaw = new javax.swing.JButton();
        viewROIs = new javax.swing.JToggleButton();
        adjustPanel = new javax.swing.JPanel();
        shift = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        merge = new javax.swing.JButton();
        splitPanel = new javax.swing.JPanel();
        splitParam1 = new javax.swing.JPanel();
        splitParam2 = new javax.swing.JPanel();
        split = new javax.swing.JButton();
        revert = new javax.swing.JButton();
        save = new javax.swing.JButton();
        processPanel = new javax.swing.JPanel();
        runButton = new javax.swing.JButton();
        borderParam = new javax.swing.JPanel();
        processCheckbox = new javax.swing.JCheckBox();
        ppChechkbox = new javax.swing.JCheckBox();
        testButton = new javax.swing.JButton();
        instersect = new javax.swing.JCheckBox();
        listScroll = new javax.swing.JScrollPane();
        list = new javax.swing.JList();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Manual Nucleus Segmentation"));
        setMinimumSize(new java.awt.Dimension(462, 640));
        setPreferredSize(new java.awt.Dimension(462, 640));

        selectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selection"));

        selectAll.setText("Select All");
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllActionPerformed(evt);
            }
        });

        selectNone.setText("Select None");
        selectNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addComponent(selectAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectNone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(selectAll)
                .addComponent(selectNone))
        );

        viewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("View")));

        viewMask.setText("Mask");
        viewMask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMaskActionPerformed(evt);
            }
        });

        viewRaw.setText("Input");
        viewRaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRawActionPerformed(evt);
            }
        });

        viewROIs.setText("ROIs");
        viewROIs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewROIsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addComponent(viewMask, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewRaw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(viewROIs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewMask)
                    .addComponent(viewRaw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewROIs)
                .addContainerGap())
        );

        adjustPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Adjust"));

        shift.setText("Shift Labels");
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        merge.setText("Merge");
        merge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergeActionPerformed(evt);
            }
        });

        splitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Split"));

        splitParam1.setPreferredSize(new java.awt.Dimension(42, 30));

        splitParam2.setPreferredSize(new java.awt.Dimension(42, 30));

        split.setText("Split");
        split.setEnabled(false);
        split.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout splitPanelLayout = new javax.swing.GroupLayout(splitPanel);
        splitPanel.setLayout(splitPanelLayout);
        splitPanelLayout.setHorizontalGroup(
            splitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(split, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
            .addComponent(splitParam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(splitParam2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        splitPanelLayout.setVerticalGroup(
            splitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitPanelLayout.createSequentialGroup()
                .addComponent(splitParam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitParam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(split))
        );

        revert.setText("Revert");
        revert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        processPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Process"));

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        borderParam.setPreferredSize(new java.awt.Dimension(42, 30));

        processCheckbox.setSelected(true);
        processCheckbox.setText("pre-filter & segment");

        ppChechkbox.setSelected(true);
        ppChechkbox.setText("post-process");

        testButton.setText("Test");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        instersect.setSelected(true);
        instersect.setText("intersect with manual mask");

        javax.swing.GroupLayout processPanelLayout = new javax.swing.GroupLayout(processPanel);
        processPanel.setLayout(processPanelLayout);
        processPanelLayout.setHorizontalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderParam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(processPanelLayout.createSequentialGroup()
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(processPanelLayout.createSequentialGroup()
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processCheckbox)
                    .addComponent(ppChechkbox)
                    .addComponent(instersect))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        processPanelLayout.setVerticalGroup(
            processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, processPanelLayout.createSequentialGroup()
                .addComponent(borderParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instersect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ppChechkbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(processPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton)
                    .addComponent(testButton)))
        );

        javax.swing.GroupLayout adjustPanelLayout = new javax.swing.GroupLayout(adjustPanel);
        adjustPanel.setLayout(adjustPanelLayout);
        adjustPanelLayout.setHorizontalGroup(
            adjustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adjustPanelLayout.createSequentialGroup()
                .addComponent(merge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adjustPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(splitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(adjustPanelLayout.createSequentialGroup()
                .addComponent(processPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(shift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adjustPanelLayout.createSequentialGroup()
                .addComponent(revert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        adjustPanelLayout.setVerticalGroup(
            adjustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adjustPanelLayout.createSequentialGroup()
                .addComponent(shift)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adjustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(merge)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adjustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revert)
                    .addComponent(save))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        listScroll.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adjustPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adjustPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(listScroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllActionPerformed
        nucleusManager.selectAll();
    }//GEN-LAST:event_selectAllActionPerformed

    private void selectNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNoneActionPerformed
        nucleusManager.selectNone();
    }//GEN-LAST:event_selectNoneActionPerformed

    private void viewMaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMaskActionPerformed
        nucleusManager.showMask();
    }//GEN-LAST:event_viewMaskActionPerformed

    private void viewRawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRawActionPerformed
        nucleusManager.openImage();
    }//GEN-LAST:event_viewRawActionPerformed

    private void viewROIsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewROIsActionPerformed
        nucleusManager.toggleShowROIs(this.viewROIs.isSelected());
    }//GEN-LAST:event_viewROIsActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        nucleusManager.shift();
    }//GEN-LAST:event_shiftActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        nucleusManager.deleteSelectedObjects();
    }//GEN-LAST:event_deleteActionPerformed

    private void mergeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergeActionPerformed
        nucleusManager.mergeSelectedObjects();
    }//GEN-LAST:event_mergeActionPerformed

    private void splitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitActionPerformed
        nucleusManager.splitObjects();
    }//GEN-LAST:event_splitActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        nucleusManager.processObjects(this.processCheckbox.isSelected(), this.instersect.isSelected(), this.ppChechkbox.isSelected(), false);
    }//GEN-LAST:event_runButtonActionPerformed

    private void revertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revertActionPerformed
        nucleusManager.revert();
    }//GEN-LAST:event_revertActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        nucleusManager.saveMask();
    }//GEN-LAST:event_saveActionPerformed

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        nucleusManager.processObjects(this.processCheckbox.isSelected(), this.instersect.isSelected(), this.ppChechkbox.isSelected(), true);
    }//GEN-LAST:event_testButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adjustPanel;
    public javax.swing.JPanel borderParam;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox instersect;
    public javax.swing.JList list;
    private javax.swing.JScrollPane listScroll;
    private javax.swing.JButton merge;
    private javax.swing.JCheckBox ppChechkbox;
    private javax.swing.JCheckBox processCheckbox;
    private javax.swing.JPanel processPanel;
    private javax.swing.JButton revert;
    private javax.swing.JButton runButton;
    private javax.swing.JButton save;
    private javax.swing.JButton selectAll;
    private javax.swing.JButton selectNone;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JButton shift;
    private javax.swing.JButton split;
    private javax.swing.JPanel splitPanel;
    public javax.swing.JPanel splitParam1;
    public javax.swing.JPanel splitParam2;
    private javax.swing.JButton testButton;
    private javax.swing.JButton viewMask;
    private javax.swing.JPanel viewPanel;
    public javax.swing.JToggleButton viewROIs;
    private javax.swing.JButton viewRaw;
    // End of variables declaration//GEN-END:variables


    
}
