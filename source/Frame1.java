import java.awt.*; 
import java.awt.event.*; 
import java.io.File;
import javax.swing.*;

public class Frame1 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -5983904233727052099L;

	//The hard-coded default path, but it self-updates
	static String path = "C:/Riot Games/League of Legends/RADS/solutions/lol_game_client_sln/releases/0.0.0.232/deploy/DATA/menu/hud";
	
	//Normal colors
	static Color selfColor = new Color(0, 180, 0, 255);
	static Color teamColor = new Color(0, 180, 0, 255);
	static Color enemyColor = new Color(200, 30, 30, 255);
	
	//Color-blind colors
	static Color blindSelfColor = new Color(0, 153, 224, 255);
	static Color blindTeamColor = new Color(0, 153, 224, 255);
	static Color blindEnemyColor = new Color(200, 30, 30, 255);
	
	//Spectator colors
	static Color specSelfColor = new Color(0, 153, 224, 255);
	static Color specTeamColor = new Color(0, 153, 224, 255);
	static Color specEnemyColor = new Color(128, 40, 156, 255);
	
	//Mana and energy bar colors
	static Color manaColor = new Color(15, 93, 178, 255);
	static Color energyColor = new Color(168, 165, 35, 255);

	JFileChooser pathChooser = new JFileChooser();
	
	//Ze Buttons
	JButton choosePathButton = new JButton("Choose path.");
	JButton chooseSelfHPButton = new JButton("Choose own champion's HP color.");
	JButton chooseTeamHPButton = new JButton("Choose team's HP color.");
	JButton chooseEnemyHPButton = new JButton("Choose enemy team's HP color.");
	JButton chooseManaButton = new JButton("Choose the mana bar's color.");
	JButton chooseEnergyButton = new JButton("Choose the energy bar's color.");
	JButton restoreDefaultButton = new JButton("Restore to default.");
	JButton saveChangesButton = new JButton("Save changes.");
	
	//Ze radio buttons
	JRadioButton normalButton = new JRadioButton("Normal");
	JRadioButton spectatorButton = new JRadioButton("Spectator");
	JRadioButton colorBlindButton = new JRadioButton("Color Blind");
	
	JLabel label = new JLabel("");
	
	Frame1(){
		//Initialize frame.
	    super("League of Legends Color Changer"); 
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container con = this.getContentPane(); 
	    this.setSize(new Dimension(390, 250));
	    this.setResizable(false);
	    setVisible(true);
		
		//Choose the default path.
		File defaultFile = new File("C:/Riot Games/League of Legends/RADS/solutions/lol_game_client_sln/releases");
		if (defaultFile.exists()){
			path = (defaultFile.listFiles()[0]).toString();
			for (File f : defaultFile.listFiles()){
				if (f.toString().length() > path.length()){
					path = f.toString();
				}
				else{
					if (f.toString().length() == path.length()){
						if (f.toString().compareTo(path) > 0){
							path = f.toString();
						}
					}	
				}
			}
			path = path.replace('\\', '/');
			path= path + "/deploy/DATA/menu/hud";
		}
		
		//Change the path. 
		choosePathButton.setActionCommand("choosePath");
		choosePathButton.addActionListener(this);		
		
		//Choose summoner's self color.
		chooseSelfHPButton.setActionCommand("chooseSelf");
		chooseSelfHPButton.addActionListener(this);
		
		//Choose summoner's team color.
		chooseTeamHPButton.setActionCommand("chooseTeam");
		chooseTeamHPButton.addActionListener(this);
		
		//Choose summoner's enemy team color.
		chooseEnemyHPButton.setActionCommand("chooseEnemy");
		chooseEnemyHPButton.addActionListener(this);
		
		//Choose mana bar color.
		chooseManaButton.setActionCommand("chooseMana");
		chooseManaButton.addActionListener(this);
		
		//Choose energy bar color.
		chooseEnergyButton.setActionCommand("chooseEnergy");
		chooseEnergyButton.addActionListener(this);
		
		//Restore colors to default
		restoreDefaultButton.setActionCommand("resetDefault");
		restoreDefaultButton.addActionListener(this);
		
		//Create the file
		saveChangesButton.setActionCommand("saveChanges");
		saveChangesButton.addActionListener(this);
		
		//add everything to GUI (god I hate Java GUIs)
		JPanel p1 = new JPanel();
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p1.add(chooseSelfHPButton);
		p1.add(chooseTeamHPButton);
		p1.add(chooseEnemyHPButton);
		p1.add(Box.createRigidArea(new Dimension(0, 20)));
		p1.add(chooseManaButton);
		p1.add(chooseEnergyButton);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		p2.add(restoreDefaultButton);
		p2.add(choosePathButton);
		p2.add(saveChangesButton);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
		normalButton.setSelected(true);
		p3.add(normalButton);
		p3.add(colorBlindButton);
		p3.add(spectatorButton);
		ButtonGroup group = new ButtonGroup();
		group.add(normalButton);
		group.add(colorBlindButton);
		group.add(spectatorButton);
		
		JPanel top = new JPanel();
		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
		top.add(p1);
		top.add(Box.createRigidArea(new Dimension(40, 0)));
		top.add(p3);
	
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		con.add(top);
		con.add(Box.createRigidArea(new Dimension(0, 20)));
		con.add(p2);
		
		top.setAlignmentX(Component.LEFT_ALIGNMENT);
		p2.setAlignmentX(Component.LEFT_ALIGNMENT);
		pack();
	  }

	@Override
	public void actionPerformed(ActionEvent e){
		//Clicked resetDefaultButton
		if("resetDefault".equals(e.getActionCommand())){
			selfColor = new Color(0, 180, 0, 255);
			teamColor = new Color(0, 180, 0, 255);
			enemyColor = new Color(200, 30, 30, 255);
			blindSelfColor = new Color(0, 153, 224, 255);
			blindTeamColor = new Color(0, 153, 224, 255);
			blindEnemyColor = new Color(200, 30, 30, 255);
			specSelfColor = new Color(0, 153, 224, 255);
			specTeamColor = new Color(0, 153, 224, 255);
			specEnemyColor = new Color(128, 40, 156, 255);
			manaColor = new Color(15, 93, 178, 255);
			energyColor = new Color(168, 165, 35, 255);
			
			JOptionPane.showMessageDialog(this, "Default restored!");
			makeFile.createFile();
		}
		
		//Clicked choosePathButton
		if("choosePath".equals(e.getActionCommand())){
			JOptionPane.showMessageDialog(this, "Open your Riot Games folder. Default is C:/Riot Games");
			pathChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = pathChooser.showOpenDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION){
	            Frame1.path = pathChooser.getSelectedFile().toString();
	            path = path.replace('\\', '/');
			}
			path = path + "/League of Legends/RADS/solutions/lol_game_client_sln/releases";
			File file = new File(path);
			
			if (file.exists()){
				path = (file.listFiles()[0]).toString();
				for (File f : file.listFiles()){
					if (f.toString().length() > path.length()){
						path = f.toString();
					}
					else{
						if (f.toString().length() == path.length()){
							if (f.toString().compareTo(path) > 0){
								path = f.toString();
							}
						}
					}	
				}
				path = path.replace('\\', '/');
				path= path + "/deploy/DATA/menu/hud";
			}
		}	
		
		Color tempColor;
		//Clicked chooseSelfHPButton
		if("chooseSelf".equals(e.getActionCommand())){
			if(spectatorButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Spectator: Choose own champion's HP bar color", 
						specSelfColor);	
				if (tempColor!=null){
					specSelfColor = tempColor;
				}
			}
			else if(colorBlindButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Color Blind: Choose own champion's HP bar color", 
						blindSelfColor);	
				if(tempColor!=null){
					blindSelfColor = tempColor;
				}
			}
			else if (normalButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Choose own champion's HP bar color", 
						selfColor);
				if(tempColor!=null){
					selfColor = tempColor;
				}
			}
		}
		
		//clicked chooseTeamHPButton
		if("chooseTeam".equals(e.getActionCommand())){
			if(spectatorButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Spectator: Choose your team's HP bar color", 
						specTeamColor);	
				if (tempColor!=null){
					specTeamColor = tempColor;
				}
			}
			else if(colorBlindButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Color Blind: Choose your team's HP bar color", 
						blindTeamColor);	
				if(tempColor!=null){
					blindTeamColor = tempColor;
				}
			}
			else if (normalButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Choose your team's HP bar color", 
						teamColor);
				if(tempColor!=null){
					teamColor = tempColor;
				}
			}
		}
		
		//clicked chooseEnemyHPButton
		if("chooseEnemy".equals(e.getActionCommand())){
			if(spectatorButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Spectator: Choose your enemy's HP bar color", 
						specEnemyColor);	
				if (tempColor!=null){
					specEnemyColor = tempColor;
				}
			}
			else if(colorBlindButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Color Blind: Choose your enemy's HP bar color", 
						blindEnemyColor);	
				if(tempColor!=null){
					blindEnemyColor = tempColor;
				}
			}
			else if (normalButton.isSelected()){
				tempColor = JColorChooser.showDialog(
						Frame1.this,
	                    "Choose your enemy's HP bar color", 
						enemyColor);
				if(tempColor!=null){
					enemyColor = tempColor;
				}
			}
		}
		
		//Clicked chooseManaButton
		if ("chooseMana".equals(e.getActionCommand())){
			tempColor = JColorChooser.showDialog(
					Frame1.this,
                    "Choose the mana bar color", 
					manaColor);
			if(tempColor!=null){
				manaColor = tempColor;
			}
		}
		
		//Clicked chooseEnergyButton
		if ("chooseEnergy".equals(e.getActionCommand())){
			tempColor = JColorChooser.showDialog(
					Frame1.this,
                    "Choose the energy bar color", 
					energyColor);
			if(tempColor!=null){
				energyColor = tempColor;
			}
		}
		
		//clicked saveChangesButton, creates a new GeneralCharacterData_Legacy.ini file
		if("saveChanges".equals(e.getActionCommand())){
			makeFile.createFile();
			JOptionPane.showMessageDialog(this, "Changes saved!");
		}
	}
	
	public static void main(String[] args) {
		new Frame1();

	}
}