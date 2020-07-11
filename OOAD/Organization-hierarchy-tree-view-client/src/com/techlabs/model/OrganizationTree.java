package com.techlabs.model;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class OrganizationTree extends JFrame {
	private JFrame frame;

	public OrganizationTree() throws Exception {
		/*OrganizationHierarchyBuilder builder = new OrganizationHierarchyBuilder(new UrlLoader());
		Employee emp = builder.getPresident();
		JFrame frame = new JFrame();
		DefaultMutableTreeNode president = new DefaultMutableTreeNode(emp.show(0));
		JTree tree= new JTree(president);*/
		//frame.add(tree);
		frame.setVisible(true);
		frame.setSize(200, 200);
		this.frame = frame;

	}
	
	

}
