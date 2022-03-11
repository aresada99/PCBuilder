package CS102PROJECT;



/* Ares Ada DORA S014479 Department of Computer Science */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BuildScreen {
	
	
	/* Ares Ada DORA S014479 Department of Computer Science */
	
	
	public static void main(String[] args) throws FileNotFoundException {
		double totalPrice = 0.0;
		
		

		
	    /*FOR PRICE WHEN YOU CHANGE ITEM IN SAME CATEGORY*/	
		String strTrue = "true";
		String strFalse = "false";

		
		JLabel mbChoosedTest = new JLabel(strFalse);
		JLabel mbChoosedItemCost = new JLabel("0.0");
		
		JLabel cpuChoosedTest = new JLabel(strFalse);
		JLabel cpuChoosedItemCost = new JLabel("0.0");
		
		JLabel memChoosedTest = new JLabel(strFalse);
		JLabel memChoosedItemCost = new JLabel("0.0");
		
		JLabel gcChoosedTest = new JLabel(strFalse);
		JLabel gcChoosedItemCost = new JLabel("0.0");
		
		JLabel storageChoosedTest = new JLabel(strFalse);
		JLabel storageChoosedItemCost = new JLabel("0.0");
		/*FOR PRICE WHEN YOU CHANGE ITEM IN SAME CATEGORY*/	
		
		
		
		
		
		String fp = new String(getFileName());
		File file = new File(fp);
		Motherboard m = new Motherboard();
		CPU c = new CPU();
		Memory mem = new Memory();
		GraphicsCard gc = new GraphicsCard();
		HardDiskDrive hdd = new HardDiskDrive();
		SolidStateDrive ssd = new SolidStateDrive();
		
		
		
		
		Scanner scan = new Scanner(file);
		Scanner scan2 = new Scanner(file);
		Scanner scan3 = new Scanner(file);
		Scanner scan4 = new Scanner(file);
		Scanner scan5 = new Scanner(file);
		
		
			
		JButton reset = new JButton("Reset");
		JButton buildScreen = new JButton("Build Screen");
		JButton checkCompatibility = new JButton("Check Compatibility");
		
		JLabel dynamicPrice = new JLabel(Double.toString(totalPrice));
		JLabel currency = new JLabel(" TL");
		
		
		
		JFrame frame = new JFrame("PC Builder");
		JPanel topSidePanel = new JPanel();
		JPanel botSidePanel = new JPanel();
		botSidePanel.setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new BorderLayout());
		frame.add(topSidePanel,BorderLayout.CENTER);
		frame.add(botSidePanel,BorderLayout.SOUTH);
		topSidePanel.setLayout(new GridLayout(5,1));
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////////////
		///MOTHERBOARD SCREEN///////////////////////////////
		////////////////////////////////////////////////////
		JPanel mbPanel = new JPanel();
		JPanel mbPanel2 = new JPanel();
		JPanel mbTitlePanel = new JPanel();
		JLabel mbTitle = new JLabel("Motherboards");
		////////////////////////////////////////////////////
		///CPU SCREEN///////////////////////////////////////
		////////////////////////////////////////////////////
		JPanel cpuPanel = new JPanel();
		JPanel cpuPanel2 = new JPanel();
		JPanel cpuTitlePanel = new JPanel();
		JLabel cpuTitle = new JLabel("CPUs");
		////////////////////////////////////////////////////
		///MEMORY SCREEN////////////////////////////////////
		////////////////////////////////////////////////////
		JPanel memoryPanel = new JPanel();
		JPanel memoryPanel2 = new JPanel();
		JPanel memoryTitlePanel = new JPanel();
		JLabel memoryTitle = new JLabel("Memories");
		////////////////////////////////////////////////////
		///GRAPHICS CARD SCREEN/////////////////////////////
		////////////////////////////////////////////////////
		JPanel gCPanel = new JPanel();
		JPanel gCPanel2 = new JPanel();
		JPanel gCTitlePanel = new JPanel();
		JLabel gCTitle = new JLabel("Graphics Cards");
		////////////////////////////////////////////////////
		///STORAGE SCREEN///////////////////////////////////
		////////////////////////////////////////////////////
		JPanel storagePanel = new JPanel();
		JPanel storagePanel2 = new JPanel();
		JPanel storageTitlePanel = new JPanel();
		JLabel storageTitle = new JLabel("Storages");
		////////////////////////////////////////////////////

		
		
		

		
		
	

		JPanel motherBoard = new JPanel();
		motherBoard.setLayout(null);
		topSidePanel.add(motherBoard);
		motherBoard.setBackground(Color.WHITE);
    	JLabel label1 = new JLabel("Motherboard");
    	JLabel mbLabel = new JLabel("");
		label1.setBounds(5,-35,100,100);
		mbLabel.setBounds(5,0,700,100);
		JButton button1 = new JButton("+");
		button1.setFont(new Font("Courier",Font.PLAIN,25));
		button1.setBounds(633,6,70,70);
		motherBoard.add(button1);
		motherBoard.add(label1);
		motherBoard.add(mbLabel);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(false);
				mbPanel.setVisible(true);

				frame.add(mbPanel);
				mbPanel.setLayout(new BorderLayout());
				mbTitle.setFont(new Font("Courier",Font.BOLD,18));
				mbTitlePanel.add(mbTitle);
				mbTitlePanel.setBackground(Color.GRAY);
				mbPanel.add(mbTitlePanel,BorderLayout.NORTH);
				mbPanel.add(mbPanel2);
				
				while(scan.hasNextLine()){
					
		            String line = scan.nextLine();
		          
		            if(line.equals("Type:Motherboard")){
		                String motherboardNameLine = scan.nextLine();
		                String motherboardName = motherboardNameLine.split(":")[1];
		                m.setName(motherboardName);
		                
		                String motherboardPriceLine = scan.nextLine();
		                String motherboardPrice = motherboardPriceLine.split(":")[1];
		                double mbPrice = Double.parseDouble(motherboardPrice);
		                m.setPrice(mbPrice);
		                
		                String motherboardSocketTypeLine = scan.nextLine();
		                String motherboardSocketType = motherboardSocketTypeLine.split(":")[1];
		                m.setSocketType(motherboardSocketType);
		                
		                String motherboardMemoryTypeLine = scan.nextLine();
		                String motherboardMemoryType = motherboardMemoryTypeLine.split(":")[1];
		                m.setMemoryType(motherboardMemoryType);
		                
		                String motherboardBusVersionLine = scan.nextLine();
		                String motherboardBusVersion = motherboardBusVersionLine.split(":")[1];
		                m.setBusVersion(motherboardBusVersion);
		                
		                
		                
		                JButton button = new JButton(m.getName()+"     "+m.getMemoryType()+"     "+m.getBusVersion()+"     "+m.getSocketType()+"     Price: "+m.getPrice()+" TL");
		                mbPanel2.add(button);
		                
		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								mbLabel.setText(button.getText());
								
								
								if(mbChoosedTest.getText().equals("false")) {
								String a = button.getText().split(" TL")[0];
								double current = Double.parseDouble(dynamicPrice.getText());
								double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
								dynamicPrice.setText(Double.toString(lastPrice));
								mbChoosedItemCost.setText( Double.toString(lastPrice-current));
								mbChoosedTest.setText(strTrue);
								
								mbPanel.setVisible(false);
								topSidePanel.setVisible(true);
								}
								
								
								else if(mbChoosedTest.getText().equals("true")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									current = current - Double.parseDouble(mbChoosedItemCost.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									mbChoosedItemCost.setText(Double.toString((lastPrice-current)));
									mbPanel.setVisible(false);
									topSidePanel.setVisible(true);
								}
								
			
								
							}
		                	
		                });
		                
		            }
		        }
			}
		});
		

		
		
		JPanel CPU = new JPanel();
		CPU.setLayout(null);
		topSidePanel.add(CPU);
		CPU.setBackground(Color.LIGHT_GRAY);
    	JLabel label2 = new JLabel("CPU");
    	JLabel cpuLabel = new JLabel("");
		label2.setBounds(5,-35,100,100);
		cpuLabel.setBounds(5,0,700,100);
		JButton button2 = new JButton("+");
		button2.setFont(new Font("Courier",Font.PLAIN,25));
		button2.setBounds(633,6,70,70);
		CPU.add(button2);
		CPU.add(label2);
		CPU.add(cpuLabel);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(false);
				cpuPanel.setVisible(true);

				frame.add(cpuPanel);
				cpuPanel.setLayout(new BorderLayout());
				cpuTitle.setFont(new Font("Courier",Font.BOLD,18));
				cpuTitlePanel.add(cpuTitle);
				cpuTitlePanel.setBackground(Color.GRAY);
				cpuPanel.add(cpuTitlePanel,BorderLayout.NORTH);
				cpuPanel.add(cpuPanel2);
				
				while(scan2.hasNextLine()){
		            String line = scan2.nextLine();
		          
		            if(line.equals("Type:CPU")){
		                String cpuNameLine = scan2.nextLine();
		                String cpuName = cpuNameLine.split(":")[1];
		                c.setName(cpuName);
		                
		                String cpuPriceLine = scan2.nextLine();
		                String cpuPrice = cpuPriceLine.split(":")[1];
		                double cpuPrice2 = Double.parseDouble(cpuPrice);
		                c.setPrice(cpuPrice2);
		                
		                String cpuCoreCountLine = scan2.nextLine();
		                String cpuCoreCount = cpuCoreCountLine.split(":")[1];
		                int cpuCoreCount2 = Integer.parseInt(cpuCoreCount);
		                c.setCoreCount(cpuCoreCount2);
		                
		                String cpuClockSpeedLine = scan2.nextLine();
		                String cpuClockSpeed = cpuClockSpeedLine.split(":")[1];
		                int cpuClockSpeed2 = Integer.parseInt(cpuClockSpeed);
		                c.setClockSpeed(cpuClockSpeed2);
		                
		                String cpuSocketTypeLine = scan2.nextLine();
		                String cpuSocketType = cpuSocketTypeLine.split(":")[1];
		                c.setSocketType(cpuSocketType);
		                
		                
		                
		                JButton button = new JButton(c.getName()+"     "+c.getCoreCount()+"  Core     "+c.getClockSpeed()+"MHz     "+c.getSocketType()+"     Price: "+c.getPrice()+" TL");
		                cpuPanel2.add(button);
		                
		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								cpuLabel.setText(button.getText());

								
								if(cpuChoosedTest.getText().equals("false")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									cpuChoosedItemCost.setText( Double.toString(lastPrice-current));
									cpuChoosedTest.setText(strTrue);
									
									cpuPanel.setVisible(false);
									topSidePanel.setVisible(true);
									}
									
									
									else if(cpuChoosedTest.getText().equals("true")) {
										String a = button.getText().split(" TL")[0];
										double current = Double.parseDouble(dynamicPrice.getText());
										current = current - Double.parseDouble(cpuChoosedItemCost.getText());
										double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
										dynamicPrice.setText(Double.toString(lastPrice));
										cpuChoosedItemCost.setText(Double.toString((lastPrice-current)));
										cpuPanel.setVisible(false);
										topSidePanel.setVisible(true);
									}
							}
		                	
		                });
		                
		                
		            }
		        }
			}
		});
		
		
		
		JPanel Memory = new JPanel();
		Memory.setLayout(null);
		topSidePanel.add(Memory);
		Memory.setBackground(Color.WHITE);
    	JLabel label3 = new JLabel("Memory");
    	JLabel memoryLabel = new JLabel("");
		label3.setBounds(5,-35,100,100);
		memoryLabel.setBounds(5,0,700,100);
		JButton button3 = new JButton("+");
		button3.setFont(new Font("Courier",Font.PLAIN,25));
		button3.setBounds(633,6,70,70);
		Memory.add(button3);
		Memory.add(label3);
		Memory.add(memoryLabel);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(false);
				memoryPanel.setVisible(true);
				frame.add(memoryPanel);
				memoryPanel.setLayout(new BorderLayout());
				memoryTitle.setFont(new Font("Courier",Font.BOLD,18));
				memoryTitlePanel.add(memoryTitle);
				memoryTitlePanel.setBackground(Color.GRAY);
				memoryPanel.add(memoryTitlePanel,BorderLayout.NORTH);
				memoryPanel.add(memoryPanel2);
				
				while(scan3.hasNextLine()){
		            String line = scan3.nextLine();
		          
		            if(line.equals("Type:Memory")){
		                String memoryNameLine = scan3.nextLine();
		                String memoryName = memoryNameLine.split(":")[1];
		                mem.setName(memoryName);
		                
		                String memoryPriceLine = scan3.nextLine();
		                String memoryPrice = memoryPriceLine.split(":")[1];
		                double memoryPrice2 = Double.parseDouble(memoryPrice);
		                mem.setPrice(memoryPrice2);
		                
		                String memorySizeLine = scan3.nextLine();
		                String memorySize = memorySizeLine.split(":")[1];
		                double memorySize2 = Double.parseDouble(memorySize);
		                mem.setSize(memorySize2);
		                
		                String memorySpeedLine = scan3.nextLine();
		                String memorySpeed = memorySpeedLine.split(":")[1];
		                int memorySpeed2 = Integer.parseInt(memorySpeed);
		                mem.setSpeed(memorySpeed2);
		                	
		                String memoryTypeLine = scan3.nextLine();
		                String memoryType = memoryTypeLine.split(":")[1];
		                mem.setType(memoryType);
		                
		                JButton button = new JButton(mem.getName()+"     "+mem.getSize()+"GB     "+mem.getType()+"     "+mem.getSpeed()+"MHz     "+"Price: "+mem.getPrice()+" TL");
		                memoryPanel2.add(button);
		                
		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								memoryLabel.setText(button.getText());
								
								if(memChoosedTest.getText().equals("false")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									memChoosedItemCost.setText( Double.toString(lastPrice-current));
									memChoosedTest.setText(strTrue);
									
									memoryPanel.setVisible(false);
									topSidePanel.setVisible(true);
									}
									
									
									else if(memChoosedTest.getText().equals("true")) {
										String a = button.getText().split(" TL")[0];
										double current = Double.parseDouble(dynamicPrice.getText());
										current = current - Double.parseDouble(memChoosedItemCost.getText());
										double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
										dynamicPrice.setText(Double.toString(lastPrice));
										memChoosedItemCost.setText(Double.toString((lastPrice-current)));
										memoryPanel.setVisible(false);
										topSidePanel.setVisible(true);
									}
								
								
							}
		                	
		                });
		                
		                
		                


		                
		                
		            }
		        }
			}
		});
		
		
		
		JPanel GraphicsCard = new JPanel();
		GraphicsCard.setLayout(null);
		topSidePanel.add(GraphicsCard);
		GraphicsCard.setBackground(Color.LIGHT_GRAY);
    	JLabel label4 = new JLabel("Graphics Card");
    	JLabel gcLabel = new JLabel("");
		label4.setBounds(5,-35,100,100);
		gcLabel.setBounds(5,0,700,100);
		JButton button4 = new JButton("+");
		button4.setFont(new Font("Courier",Font.PLAIN,25));
		button4.setBounds(633,6,70,70);
		GraphicsCard.add(button4);
		GraphicsCard.add(label4);
		GraphicsCard.add(gcLabel);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(false);
				gCPanel.setVisible(true);
				frame.add(gCPanel);
				gCPanel.setLayout(new BorderLayout());
				gCTitle.setFont(new Font("Courier",Font.BOLD,18));
				gCTitlePanel.add(gCTitle);
				gCTitlePanel.setBackground(Color.GRAY);
				gCPanel.add(gCTitlePanel,BorderLayout.NORTH);
				gCPanel.add(gCPanel2);
				
				while(scan4.hasNextLine()){
		            String line = scan4.nextLine();
		          
		            if(line.equals("Type:GraphicsCard")){
		                String graphicsCardNameLine = scan4.nextLine();
		                String graphicsCardName = graphicsCardNameLine.split(":")[1];
		                gc.setName(graphicsCardName);
		                
		                String graphicsCardPriceLine = scan4.nextLine();
		                String graphicsCardPrice = graphicsCardPriceLine.split(":")[1];
		                double graphicsCardPrice2 = Double.parseDouble(graphicsCardPrice);
		                gc.setPrice(graphicsCardPrice2); 
		                
		                String graphicsCardCoreCountLine = scan4.nextLine();
		                String graphicsCardCoreCount = graphicsCardCoreCountLine.split(":")[1];
		                int graphicsCardCoreCount2 = Integer.parseInt(graphicsCardCoreCount);
		                gc.setCoreCount(graphicsCardCoreCount2);	
		                
		                String graphicsCardClockSpeedLine = scan4.nextLine();
		                String graphicsCardClockSpeed = graphicsCardClockSpeedLine.split(":")[1];
		                int graphicsCardClockSpeed2 = Integer.parseInt(graphicsCardClockSpeed);
		                gc.setClockSpeed(graphicsCardClockSpeed2);
		                
		                String graphicsCardMemorySizeLine = scan4.nextLine();
		                String graphicsCardMemorySize = graphicsCardMemorySizeLine.split(":")[1];
		                int graphicsCardMemorySize2 = Integer.parseInt(graphicsCardMemorySize);
		                gc.setMemorySize(graphicsCardMemorySize2);
		                
		                String graphicsCardMemorySpeedLine = scan4.nextLine();
		                String graphicsCardMemorySpeed = graphicsCardMemorySpeedLine.split(":")[1];
		                int graphicsCardMemorySpeed2 = Integer.parseInt(graphicsCardMemorySpeed);
		                gc.setMemorySpeed(graphicsCardMemorySpeed2);
		                
		                String graphicsCardMemoryTypeLine = scan4.nextLine();
		                String graphicsCardMemoryType = graphicsCardMemoryTypeLine.split(":")[1];
		                gc.setMemoryType(graphicsCardMemoryType);
		                
		                String graphicsCardBusVersionLine = scan4.nextLine();
		                String graphicsCardBusVersion = graphicsCardBusVersionLine.split(":")[1];
		                gc.setBusVersion(graphicsCardBusVersion);
		                
		                
		                JButton button = new JButton(gc.getName()+"     "+gc.getCoreCount()+" Core     "+gc.getClockSpeed()+"MHz     "+gc.getMemorySize()+"GB     "+gc.getMemoryType()+"     "+gc.getBusVersion()+"     Price: "+gc.getPrice()+" TL");
		                gCPanel2.add(button);

		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								gcLabel.setText(button.getText());
								
								
								if(gcChoosedTest.getText().equals("false")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									gcChoosedItemCost.setText( Double.toString(lastPrice-current));
									gcChoosedTest.setText(strTrue);
									
									gCPanel.setVisible(false);
									topSidePanel.setVisible(true);
									}
									
									
									else if(gcChoosedTest.getText().equals("true")) {
										String a = button.getText().split(" TL")[0];
										double current = Double.parseDouble(dynamicPrice.getText());
										current = current - Double.parseDouble(gcChoosedItemCost.getText());
										double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
										dynamicPrice.setText(Double.toString(lastPrice));
										gcChoosedItemCost.setText(Double.toString((lastPrice-current)));
										gCPanel.setVisible(false);
										topSidePanel.setVisible(true);
									}
								
							}
		                	
		                });
		                
		            }
		        }
			}
			
		});
		
		
		
		JPanel Storage = new JPanel();
		Storage.setLayout(null);
		topSidePanel.add(Storage);
		Storage.setBackground(Color.WHITE);
    	JLabel label5 = new JLabel("Storage");
    	JLabel storageLabel = new JLabel("");
		label5.setBounds(5,-35,100,100);
		storageLabel.setBounds(5,0,700,100);
		JButton button5 = new JButton("+");
		button5.setFont(new Font("Courier",Font.PLAIN,25));
		button5.setBounds(633,6,70,70);
		Storage.add(button5);
		Storage.add(label5);
		Storage.add(storageLabel);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(false);
				storagePanel.setVisible(true);
				frame.add(storagePanel);
				storagePanel.setLayout(new BorderLayout());
				storageTitle.setFont(new Font("Courier",Font.BOLD,18));
				storageTitlePanel.add(storageTitle);
				storageTitlePanel.setBackground(Color.GRAY);
				storagePanel.add(storageTitlePanel,BorderLayout.NORTH);
				storagePanel.add(storagePanel2);
				
				while(scan5.hasNextLine()){
		            String line = scan5.nextLine();
		          
		            if(line.equals("Type:SolidStateDrive")){
		                String ssdNameLine = scan5.nextLine();
		                String ssdName = ssdNameLine.split(":")[1];
		                ssd.setName(ssdName);
		                
		                String ssdPriceLine = scan5.nextLine();
		                String ssdPrice = ssdPriceLine.split(":")[1];
		                double ssdPrice2 = Double.parseDouble(ssdPrice);
		                ssd.setPrice(ssdPrice2);
		                
		                String ssdStorageSizeLine = scan5.nextLine();
		                String ssdStorageSize = ssdStorageSizeLine.split(":")[1];
		                int ssdStorageSize2 = Integer.parseInt(ssdStorageSize);
		                ssd.setStorageSize(ssdStorageSize2);
		                
		                String ssdBandwithLine = scan5.nextLine();
		                String ssdBandwith = ssdBandwithLine.split(":")[1];
		                int ssdBandwith2 = Integer.parseInt(ssdBandwith);
		                ssd.setBandwith(ssdBandwith2);
		                
		                
		                JButton button = new JButton(ssd.getName()+"     SSD     "+ssd.getStorageSize()+"GB     "+ssd.getBandwith()+"MBps     Price: "+ssd.getPrice()+" TL");
		                storagePanel2.add(button);
		                
		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								storageLabel.setText(button.getText());
								
								
								if(storageChoosedTest.getText().equals("false")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									storageChoosedItemCost.setText( Double.toString(lastPrice-current));
									storageChoosedTest.setText(strTrue);
									
									storagePanel.setVisible(false);
									topSidePanel.setVisible(true);
									}
									
									
									else if(storageChoosedTest.getText().equals("true")) {
										String a = button.getText().split(" TL")[0];
										double current = Double.parseDouble(dynamicPrice.getText());
										current = current - Double.parseDouble(storageChoosedItemCost.getText());
										double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
										dynamicPrice.setText(Double.toString(lastPrice));
										storageChoosedItemCost.setText(Double.toString((lastPrice-current)));
										storagePanel.setVisible(false);
										topSidePanel.setVisible(true);
									}
							}
		                	
		                });
		                
		            }
		            
		            
		            
		            if(line.equals("Type:HardDiskDrive")){
		                String hddNameLine = scan5.nextLine();
		                String hddName = hddNameLine.split(":")[1];
		                hdd.setName(hddName);
		                
		                String hddPriceLine = scan5.nextLine();
		                String hddPrice = hddPriceLine.split(":")[1];
		                double hddPrice2 = Double.parseDouble(hddPrice);
		                hdd.setPrice(hddPrice2);
		                
		                String hddStorageSizeLine = scan5.nextLine();
		                String hddStorageSize = hddStorageSizeLine.split(":")[1];
		                int hddStorageSize2 = Integer.parseInt(hddStorageSize);
		                hdd.setStorageSize(hddStorageSize2);
		                
		                String hddBandwithLine = scan5.nextLine();
		                String hddBandwith = hddBandwithLine.split(":")[1];
		                int hddBandwith2 = Integer.parseInt(hddBandwith);
		                hdd.setBandwith(hddBandwith2);
		                
		                JButton button = new JButton(hdd.getName()+"       HDD       "+hdd.getStorageSize()+"GB       "+hdd.getBandwith()+"MBps       Price: "+hdd.getPrice()+" TL");
		                storagePanel2.add(button);
		                
		                button.addActionListener(new ActionListener() {

							
							public void actionPerformed(ActionEvent e) {
								storageLabel.setText(button.getText());

								if(storageChoosedTest.getText().equals("false")) {
									String a = button.getText().split(" TL")[0];
									double current = Double.parseDouble(dynamicPrice.getText());
									double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
									dynamicPrice.setText(Double.toString(lastPrice));
									storageChoosedItemCost.setText( Double.toString(lastPrice-current));
									storageChoosedTest.setText(strTrue);
									
									storagePanel.setVisible(false);
									topSidePanel.setVisible(true);
									}
									
									
									else if(storageChoosedTest.getText().equals("true")) {
										String a = button.getText().split(" TL")[0];
										double current = Double.parseDouble(dynamicPrice.getText());
										current = current - Double.parseDouble(storageChoosedItemCost.getText());
										double lastPrice = current+Double.parseDouble(a.split("Price: ")[1]);
										dynamicPrice.setText(Double.toString(lastPrice));
										storageChoosedItemCost.setText(Double.toString((lastPrice-current)));
										storagePanel.setVisible(false);
										topSidePanel.setVisible(true);
								
								
							}
							}
							});
		                
		            }


		                
		                
		            
		        }
			}
		});
		
		

		
		
		
		
		botSidePanel.add(reset);
		   reset.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					mbLabel.setText("");
					cpuLabel.setText("");
					memoryLabel.setText("");
					gcLabel.setText("");
					storageLabel.setText("");
					mbChoosedTest.setText(strFalse);
					cpuChoosedTest.setText(strFalse);
					memChoosedTest.setText(strFalse);
					gcChoosedTest.setText(strFalse);
					storageChoosedTest.setText(strFalse);
					double resetter = 0.0;
					dynamicPrice.setText(Double.toString(resetter));
				}
           	
           });
		
		

		
		
		botSidePanel.add(buildScreen);
		botSidePanel.add(checkCompatibility);
		
		checkCompatibility.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				String mbSocketType;
				String cpuSocketType;
				String mbBusVersion;
				String gcBusVersion;
				String mbMemoryType;
				String memMemoryType;
				
				if(!mbLabel.getText().equals("") && !cpuLabel.getText().equals("") && !memoryLabel.getText().equals("") && !gcLabel.getText().equals("") && !storageLabel.getText().equals("") ) {
				
				String[] mbList = new String[3];
				String a = mbLabel.getText().split("     Price:")[0];
				for(int i =0;i<3;i++) {
					a=a.split("     ",2)[1];
					mbList[i]=a;
				}
				mbSocketType = mbList[2];
				
				
				String[] cpuList = new String[3];
				String b = cpuLabel.getText().split("     Price:")[0];
				for(int i =0;i<3;i++) {
					b=b.split("     ",2)[1];
					cpuList[i]=b;
				}
				cpuSocketType=cpuList[2];

				
				
				String[] mbList2 = new String[2];
				String c = mbLabel.getText().split("     Price:")[0];
				for(int i = 0;i<2;i++) {
					c=c.split("     ",2)[1];
					mbList2[i]=c;
				}
				mbBusVersion = mbList2[1].split("     ")[0];

				
				String[] gcList = new String[5];
				String d = gcLabel.getText().split("     Price:")[0];
				for(int i = 0;i<5;i++) {
					d=d.split("     ",2)[1];
					gcList[i]=d;
				}
				gcBusVersion = gcList[4];

				
				String first;
				String second;
				String f = mbLabel.getText().split("     Price:")[0];
				first = f.split("     ",2)[1];
				second = first.split("     ",2)[0];
				mbMemoryType=second;

				
				String first2;
				String second2;
				String third2;
				String g = memoryLabel.getText().split("     Price:")[0];
				first2 = g.split("     ",2)[1];
				second2= first2.split("     ",2)[1];
				third2 = second2.split("     ",2)[0];
				memMemoryType=third2;
				
				
				if(mbSocketType.equals(cpuSocketType) && mbBusVersion.equals(gcBusVersion) && mbMemoryType.equals(memMemoryType)) {
					JOptionPane.showMessageDialog(null, "Computer is compatible. ", "Great!", JOptionPane.INFORMATION_MESSAGE);
				}
				else {JOptionPane.showMessageDialog(null, "Computer is NOT compatible.", "!!!!", JOptionPane.ERROR_MESSAGE);}
				
				
				}
				else {JOptionPane.showMessageDialog(null, "You haven't choose all the components!Please choose all of them.", "!!!!!!!!!!", JOptionPane.ERROR_MESSAGE);}
				
				
			}
			
		});
		
		
		
		
		botSidePanel.add(new JLabel("Price: "));
		botSidePanel.add(dynamicPrice);
		botSidePanel.add(currency);
		buildScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				topSidePanel.setVisible(true);
				mbPanel.setVisible(false);
				cpuPanel.setVisible(false);
				memoryPanel.setVisible(false);
				gCPanel.setVisible(false);
				storagePanel.setVisible(false);
			}
		});
		
		
		
		
		

		
		
		
		
		
		
	
				
		
		
		frame.setLocation(550,250);
		frame.setSize(750, 500);
		frame.setVisible(true);
		
	}
	
	public static String getFileName(){
		 JFileChooser chooser = new JFileChooser();
		 FileNameExtensionFilter filter = new FileNameExtensionFilter("Txt file", "txt");
		 chooser.setFileFilter(filter);
		 int returnVal = chooser.showOpenDialog(null);
		 if(returnVal != JFileChooser.APPROVE_OPTION) {
		 throw new RuntimeException("Failed to choose file");
		 }
		 return chooser.getSelectedFile().getAbsolutePath();
		}
	

	
}


