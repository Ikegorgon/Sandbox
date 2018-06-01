package sandbox.view;

import sandbox.controller.*;
import sandbox.model.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;

public class SandboxPanel extends JPanel implements MouseListener, 
	MouseMotionListener, ActionListener, ChangeListener {
	private SandboxController app;
	private SandboxFrame frame;
	private Sandbox sandbox;
	private SpringLayout appLayout;
	private JLabel name;
	private ArrayList<JButton> buttonList;
	private JButton[] buttons;
	private JButton clear;
	private JButton erase;
	private JButton metal;
	private JButton sand;
	private JButton water;
	private JButton wood;
	private JButton lava;
	private JButton acid;
	private JButton gas;
	private JButton ice;
	private Image image;
	private int cellSize;
	private int tool;
	private int numRows;
	private int numCols;
	private int[] mouseLoc;
	
//	public SandboxPanel() {
//		
//	}
	public SandboxPanel(SandboxController app) {
		super();
		int numRows = 100;
		int numCols = 100;
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		this.app = app;
		this.numRows = numRows;
		this.numCols = numCols;
		sandbox = new Sandbox(100, 100);
		appLayout = new SpringLayout();
		name = new JLabel("Sandbox");
		clear = new JButton("Clear");
		erase = new JButton("Erase");
		metal = new JButton("Metal");
		sand = new JButton("Sand");
		water = new JButton("Water");
		wood = new JButton("Wood");
		lava = new JButton("Lava");
		acid = new JButton("Acid");
		gas = new JButton("Gas");
		ice = new JButton("Ice");
		cellSize = Math.max(1, 600 / Math.max(numRows, numCols));
		image = new BufferedImage(numCols * cellSize, numRows * cellSize,
				BufferedImage.TYPE_INT_RGB);
		tool = 1;
		mouseLoc = null;
		
		buttonList = new ArrayList<JButton>();
		buttonList.add(clear);
		buttonList.add(erase);
		buttonList.add(metal);
		buttonList.add(sand);
		buttonList.add(water);
		buttonList.add(wood);
		buttonList.add(lava);
		buttonList.add(acid);
		buttonList.add(gas);
		buttonList.add(ice);
		buttons = new JButton[buttonList.size()];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = buttonList.get(i);
		}
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupLayout()  {
		
	}
	private void setupPanel() {
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(appLayout);
		this.add(name);
		for (int i = 0; i < buttons.length; i++) {
			this.add(buttonList.get(i));
		}
	}
	private void setupListeners() {
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		metal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		sand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		wood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		lava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		acid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		gas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		ice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
	}
	public void stateChanged(ChangeEvent e) {
		
	}
	public void actionPerformed(ActionEvent e) {
		tool = Integer.parseInt(e.getActionCommand());
		for (JButton button : buttons) {
			button.setSelected(false);
			((JButton)e.getSource()).setSelected(true);
		}
	}
	public void mouseDragged(MouseEvent e) {
		mouseLoc = toLocation(e);
	}
	public void mouseMoved(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mousePressed(MouseEvent e) {
		mouseLoc = toLocation(e);
	}
	public void mouseReleased(MouseEvent e) {
		mouseLoc = null;
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	private int[] toLocation(MouseEvent e) {
		int row = e.getX() / cellSize;
		int col = e.getY() / cellSize;
		if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
			return null;
		}
		int[] loc = new int[2];
		loc[0] = row;
		loc[1] = col;
		return loc;
	}
}
