package com.techlabs.model;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class OrganizationTree extends JFrame {
	public OrganizationTree() throws Exception {
		
		OrganizationHierarchyBuilder builder = new OrganizationHierarchyBuilder(new UrlLoader());
		Employee e = builder.getPresident();
		DefaultMutableTreeNode president = new DefaultMutableTreeNode(e.getEmployeeName());
		addChild(e, president);
		JTree tree = new JTree(president);
		add(tree);
		this.setVisible(true);
		this.setSize(500, 500);
		
		
	
		// TODO Auto-generated constructor stub
	}
	
	
	public void addChild(Employee e , DefaultMutableTreeNode node ) {
		if(e.getEmployee()!=null) {
			for(Employee emp : e.getEmployee()) {
				DefaultMutableTreeNode child = new DefaultMutableTreeNode(emp.getEmployeeName());
				addChild(emp, child);
				node.add(child);
			}
		}
		
	}

	
}
