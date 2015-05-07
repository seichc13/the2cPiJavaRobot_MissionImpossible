package mainView;

import java.io.File;
import javax.swing.table.TableModel;
import tracking.model.MessageModel;

public class The2CPi_J_Project_GUI extends javax.swing.JFrame {

    private MessageModel messageModel;
    
    public The2CPi_J_Project_GUI() {
        initComponents();
        messageModel = new MessageModel();
        tbMessageList.setModel((TableModel) messageModel);
        System.out.println("It works!");
        if (!cbTrackingToFile.isSelected()) {
            cbCreateNewFile.setEnabled(false);
        } else {
            btProcessCommandsFromFile.setEnabled(false);
            btProcessCommandsFromList.setEnabled(false);
        }
    }
    
    public void initRobotSimulator(){
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgSimulationNetwork = new javax.swing.ButtonGroup();
        bgMessage = new javax.swing.ButtonGroup();
        diFileChooser = new javax.swing.JDialog();
        fcTrackingFile = new javax.swing.JFileChooser();
        paGridBagIsBullshit = new javax.swing.JPanel();
        paCommunication = new javax.swing.JPanel();
        rbSimulation = new javax.swing.JRadioButton();
        rbNetwork = new javax.swing.JRadioButton();
        btConnect = new javax.swing.JButton();
        btDisconnect = new javax.swing.JButton();
        lbCurrentRobot = new javax.swing.JLabel();
        cbRobotList = new javax.swing.JComboBox();
        btShowTrackingMap = new javax.swing.JButton();
        tfRobotID = new javax.swing.JTextField();
        rbSingleMessage = new javax.swing.JRadioButton();
        rbMessageList = new javax.swing.JRadioButton();
        paTeaching = new javax.swing.JPanel();
        lbFile = new javax.swing.JLabel();
        cbTrackingToFile = new javax.swing.JCheckBox();
        btFileChooser = new javax.swing.JButton();
        tfPath = new javax.swing.JTextField();
        btProcessCommandsFromFile = new javax.swing.JButton();
        cbCreateNewFile = new javax.swing.JCheckBox();
        btProcessCommandsFromList = new javax.swing.JButton();
        paCommand = new javax.swing.JPanel();
        lbRelativeMoves = new javax.swing.JLabel();
        lbSendToID = new javax.swing.JLabel();
        tfSendToID = new javax.swing.JTextField();
        lbSpeed = new javax.swing.JLabel();
        slSpeed = new javax.swing.JSlider();
        lbAbsoluteMoves = new javax.swing.JLabel();
        btMoveToXY = new javax.swing.JButton();
        btHome = new javax.swing.JButton();
        lbX = new javax.swing.JLabel();
        lbY = new javax.swing.JLabel();
        tfX = new javax.swing.JTextField();
        tfY = new javax.swing.JTextField();
        paMoveButtons = new javax.swing.JPanel();
        btMove0 = new javax.swing.JButton();
        btMove90 = new javax.swing.JButton();
        btMove180 = new javax.swing.JButton();
        btMove270 = new javax.swing.JButton();
        paCommandList = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCommandList = new javax.swing.JTable();
        paMessageList = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbMessageList = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmVisualisation = new javax.swing.JMenu();
        jmMessageTracking = new javax.swing.JMenu();
        jmStatisticsAndAnalysis = new javax.swing.JMenu();
        jmConfig = new javax.swing.JMenu();
        jmHelp = new javax.swing.JMenu();

        diFileChooser.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        diFileChooser.setTitle("Choose File");

        fcTrackingFile.setCurrentDirectory(new java.io.File("C:\\Users\\Christopher\\Desktop"));
        fcTrackingFile.setDialogTitle("Choose File");
        fcTrackingFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChooseFile(evt);
            }
        });
        diFileChooser.getContentPane().add(fcTrackingFile, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2C PI Java Robot");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        paGridBagIsBullshit.setLayout(new java.awt.GridLayout(2, 1));

        paCommunication.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, null, null), "Communication"));
        paCommunication.setLayout(new java.awt.GridBagLayout());

        bgSimulationNetwork.add(rbSimulation);
        rbSimulation.setSelected(true);
        rbSimulation.setText("Simulation");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(rbSimulation, gridBagConstraints);

        bgSimulationNetwork.add(rbNetwork);
        rbNetwork.setText("Network");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(rbNetwork, gridBagConstraints);

        btConnect.setText("Connect");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(btConnect, gridBagConstraints);

        btDisconnect.setText("Disconnect");
        btDisconnect.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(btDisconnect, gridBagConstraints);

        lbCurrentRobot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCurrentRobot.setText("Current Robot:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(lbCurrentRobot, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(cbRobotList, gridBagConstraints);

        btShowTrackingMap.setText("Show Tracking Map");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(btShowTrackingMap, gridBagConstraints);

        tfRobotID.setEditable(false);
        tfRobotID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRobotID.setText("Robot-ID: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(tfRobotID, gridBagConstraints);

        bgMessage.add(rbSingleMessage);
        rbSingleMessage.setSelected(true);
        rbSingleMessage.setText("Single Message");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(rbSingleMessage, gridBagConstraints);

        bgMessage.add(rbMessageList);
        rbMessageList.setText("Message List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommunication.add(rbMessageList, gridBagConstraints);

        paGridBagIsBullshit.add(paCommunication);

        paTeaching.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, null, null), "Teaching"));
        paTeaching.setLayout(new java.awt.GridBagLayout());

        lbFile.setText("File:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(lbFile, gridBagConstraints);

        cbTrackingToFile.setText("Tracking to File");
        cbTrackingToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onTrackingToFileIsSelected(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(cbTrackingToFile, gridBagConstraints);

        btFileChooser.setText("...");
        btFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChooseFile(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(btFileChooser, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(tfPath, gridBagConstraints);

        btProcessCommandsFromFile.setText("Process Commands from File");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(btProcessCommandsFromFile, gridBagConstraints);

        cbCreateNewFile.setText("Create New File");
        cbCreateNewFile.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(cbCreateNewFile, gridBagConstraints);

        btProcessCommandsFromList.setText("Process Commands from List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paTeaching.add(btProcessCommandsFromList, gridBagConstraints);

        paGridBagIsBullshit.add(paTeaching);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(paGridBagIsBullshit, gridBagConstraints);

        paCommand.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, null, null), "Command"));
        paCommand.setLayout(new java.awt.GridBagLayout());

        lbRelativeMoves.setText("Relative Moves:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbRelativeMoves, gridBagConstraints);

        lbSendToID.setText("Send to ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbSendToID, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(tfSendToID, gridBagConstraints);

        lbSpeed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSpeed.setText("Speed [%]:");
        lbSpeed.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbSpeed, gridBagConstraints);

        slSpeed.setMajorTickSpacing(10);
        slSpeed.setMinorTickSpacing(5);
        slSpeed.setPaintLabels(true);
        slSpeed.setPaintTicks(true);
        slSpeed.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(slSpeed, gridBagConstraints);

        lbAbsoluteMoves.setText("Absolute Moves:");
        lbAbsoluteMoves.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbAbsoluteMoves, gridBagConstraints);

        btMoveToXY.setText("Move To X, Y");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(btMoveToXY, gridBagConstraints);

        btHome.setText("Home");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(btHome, gridBagConstraints);

        lbX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbX.setText("X:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbX, gridBagConstraints);

        lbY.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbY.setText("Y:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(lbY, gridBagConstraints);

        tfX.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(tfX, gridBagConstraints);

        tfY.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paCommand.add(tfY, gridBagConstraints);

        paMoveButtons.setLayout(new java.awt.GridBagLayout());

        btMove0.setText("0°");
        btMove0.setMaximumSize(new java.awt.Dimension(65, 25));
        btMove0.setMinimumSize(new java.awt.Dimension(65, 25));
        btMove0.setPreferredSize(new java.awt.Dimension(65, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paMoveButtons.add(btMove0, gridBagConstraints);

        btMove90.setText("90°");
        btMove90.setMaximumSize(new java.awt.Dimension(65, 25));
        btMove90.setMinimumSize(new java.awt.Dimension(65, 25));
        btMove90.setPreferredSize(new java.awt.Dimension(65, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paMoveButtons.add(btMove90, gridBagConstraints);

        btMove180.setText("180°");
        btMove180.setMaximumSize(new java.awt.Dimension(65, 25));
        btMove180.setMinimumSize(new java.awt.Dimension(65, 25));
        btMove180.setPreferredSize(new java.awt.Dimension(65, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paMoveButtons.add(btMove180, gridBagConstraints);

        btMove270.setText("270°");
        btMove270.setMaximumSize(new java.awt.Dimension(65, 25));
        btMove270.setMinimumSize(new java.awt.Dimension(65, 25));
        btMove270.setPreferredSize(new java.awt.Dimension(65, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paMoveButtons.add(btMove270, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        paCommand.add(paMoveButtons, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(paCommand, gridBagConstraints);

        paCommandList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, null, null), "Command List"));
        paCommandList.setMaximumSize(new java.awt.Dimension(300, 150));
        paCommandList.setMinimumSize(new java.awt.Dimension(300, 150));
        paCommandList.setPreferredSize(new java.awt.Dimension(300, 150));
        paCommandList.setLayout(new java.awt.BorderLayout());

        tbCommandList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Command", "Direction|Speed", "Information"
            }
        ));
        jScrollPane3.setViewportView(tbCommandList);

        paCommandList.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(paCommandList, gridBagConstraints);

        paMessageList.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, null, null), "Message List"));
        paMessageList.setMaximumSize(new java.awt.Dimension(300, 150));
        paMessageList.setMinimumSize(new java.awt.Dimension(300, 150));
        paMessageList.setPreferredSize(new java.awt.Dimension(300, 150));
        paMessageList.setRequestFocusEnabled(false);
        paMessageList.setLayout(new java.awt.BorderLayout());

        tbMessageList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "X|Y", "Direction|Speed", "Status", "..."
            }
        ));
        jScrollPane4.setViewportView(tbMessageList);

        paMessageList.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        getContentPane().add(paMessageList, gridBagConstraints);

        jmFile.setText("File");
        jMenuBar1.add(jmFile);

        jmVisualisation.setText("Visualisation");
        jMenuBar1.add(jmVisualisation);

        jmMessageTracking.setText("Message Tracking");
        jMenuBar1.add(jmMessageTracking);

        jmStatisticsAndAnalysis.setText("Statistics & Analysis");
        jMenuBar1.add(jmStatisticsAndAnalysis);

        jmConfig.setText("Config");
        jmConfig.setToolTipText("");
        jMenuBar1.add(jmConfig);

        jmHelp.setText("Help");
        jMenuBar1.add(jmHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onTrackingToFileIsSelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onTrackingToFileIsSelected
        if (cbTrackingToFile.isSelected()) {
            cbCreateNewFile.setEnabled(true);
        } else if (!cbTrackingToFile.isSelected()) {
            cbCreateNewFile.setEnabled(false);
        }

        if (cbTrackingToFile.isSelected()) {
            btProcessCommandsFromFile.setEnabled(false);
            btProcessCommandsFromList.setEnabled(false);
        } else if (!cbTrackingToFile.isSelected()) {
            btProcessCommandsFromFile.setEnabled(true);
            btProcessCommandsFromList.setEnabled(true);
        }
    }//GEN-LAST:event_onTrackingToFileIsSelected

    private void onChooseFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onChooseFile
        diFileChooser.setVisible(true);
        File file = fcTrackingFile.getSelectedFile();
        tfPath.setText("" + file);
        if (file != null) {
            diFileChooser.dispose();
        }
    }//GEN-LAST:event_onChooseFile

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(The2CPi_J_Project_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(The2CPi_J_Project_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(The2CPi_J_Project_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(The2CPi_J_Project_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new The2CPi_J_Project_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMessage;
    private javax.swing.ButtonGroup bgSimulationNetwork;
    private javax.swing.JButton btConnect;
    private javax.swing.JButton btDisconnect;
    private javax.swing.JButton btFileChooser;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btMove0;
    private javax.swing.JButton btMove180;
    private javax.swing.JButton btMove270;
    private javax.swing.JButton btMove90;
    private javax.swing.JButton btMoveToXY;
    private javax.swing.JButton btProcessCommandsFromFile;
    private javax.swing.JButton btProcessCommandsFromList;
    private javax.swing.JButton btShowTrackingMap;
    private javax.swing.JCheckBox cbCreateNewFile;
    private javax.swing.JComboBox cbRobotList;
    private javax.swing.JCheckBox cbTrackingToFile;
    private javax.swing.JDialog diFileChooser;
    private javax.swing.JFileChooser fcTrackingFile;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu jmConfig;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenu jmMessageTracking;
    private javax.swing.JMenu jmStatisticsAndAnalysis;
    private javax.swing.JMenu jmVisualisation;
    private javax.swing.JLabel lbAbsoluteMoves;
    private javax.swing.JLabel lbCurrentRobot;
    private javax.swing.JLabel lbFile;
    private javax.swing.JLabel lbRelativeMoves;
    private javax.swing.JLabel lbSendToID;
    private javax.swing.JLabel lbSpeed;
    private javax.swing.JLabel lbX;
    private javax.swing.JLabel lbY;
    private javax.swing.JPanel paCommand;
    private javax.swing.JPanel paCommandList;
    private javax.swing.JPanel paCommunication;
    private javax.swing.JPanel paGridBagIsBullshit;
    private javax.swing.JPanel paMessageList;
    private javax.swing.JPanel paMoveButtons;
    private javax.swing.JPanel paTeaching;
    private javax.swing.JRadioButton rbMessageList;
    private javax.swing.JRadioButton rbNetwork;
    private javax.swing.JRadioButton rbSimulation;
    private javax.swing.JRadioButton rbSingleMessage;
    private javax.swing.JSlider slSpeed;
    private javax.swing.JTable tbCommandList;
    private javax.swing.JTable tbMessageList;
    private javax.swing.JTextField tfPath;
    private javax.swing.JTextField tfRobotID;
    private javax.swing.JTextField tfSendToID;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    // End of variables declaration//GEN-END:variables
}
