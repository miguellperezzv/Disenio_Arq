import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sun.java.swing.plaf.windows.*;
import java.util.*;

public class EntSrchBuilder extends UIBuilder {

	
	private JTextField txtName = new JTextField(15);
	private JTextField txtNit = new JTextField(15);
	private JTextField txtAddress = new JTextField(10);
	private JTextField txtPhone1 = new JTextField(10);
	private JTextField txtPhone2 = new JTextField(10);
	
	@Override
	public void addUIControls() {
		// TODO Auto-generated method stub
		searchUI = new JPanel();
	    JLabel lblName = new JLabel("Name :");
	    JLabel lblNit = new JLabel("NIT:");
	    JLabel lblAddress = new JLabel("Address :");
	    JLabel lblPhone1 = new JLabel("Phone 1 :");
	    JLabel lblPhone2 = new JLabel("Phone 2 :");

	    GridBagLayout gridbag = new GridBagLayout();
	    searchUI.setLayout(gridbag);
	    GridBagConstraints gbc = new GridBagConstraints();
	    searchUI.add(lblName);
	    searchUI.add(txtName);
	    searchUI.add(lblNit);
	    searchUI.add(txtNit);
	    searchUI.add(lblAddress);
	    searchUI.add(txtAddress);
	    searchUI.add(lblPhone1);
	    searchUI.add(txtPhone1);
	    searchUI.add(lblPhone2);
	    searchUI.add(txtPhone2);

	    gbc.anchor = GridBagConstraints.WEST;

	    gbc.insets.top = 5;
	    gbc.insets.bottom = 5;
	    gbc.insets.left = 5;
	    gbc.insets.right = 5;

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gridbag.setConstraints(lblName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gridbag.setConstraints(lblNit, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gridbag.setConstraints(lblAddress, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gridbag.setConstraints(lblPhone1, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gridbag.setConstraints(lblPhone2, gbc);

	    gbc.anchor = GridBagConstraints.WEST;
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gridbag.setConstraints(txtName, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    gridbag.setConstraints(txtNit, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gridbag.setConstraints(txtAddress, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 3;
	    gridbag.setConstraints(txtPhone1, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    gridbag.setConstraints(txtPhone2, gbc);
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		txtName.setText("Enterprise name");
		txtNit.setText("NIT Number");
		txtAddress.setText("Enterprise Address");
	}

	@Override
	public String getSQL() {
		// TODO Auto-generated method stub
		String sql = ("Select * from Enterprise where name='" +
	            txtName.getText() + "' and NIT = " +
	            txtNit.getText() + " and address='" +
	            txtAddress.getText() + "and phone1 =" +txtPhone1.getText()+
	            " and phone2 = "+txtPhone2.getText());
		return sql;
	}

}
