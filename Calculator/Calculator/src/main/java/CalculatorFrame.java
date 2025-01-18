import java.awt.event.KeyEvent;

public class CalculatorFrame extends javax.swing.JFrame {

    public CalculatorFrame() {
        initComponents();
    }
    private void initComponents() {

        calculatorPanel = new javax.swing.JPanel();
        calculatorTextField = new javax.swing.JTextField();
        calculatorLabel = new javax.swing.JLabel();
        divideButton = new javax.swing.JButton();
        backspaceButton = new javax.swing.JButton();
        equalToButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        sqRootButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sqButton = new javax.swing.JButton();
        clearAllButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        bracketCButton = new javax.swing.JButton();
        bracketOButton = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calculatorPanel.setBackground(new java.awt.Color(51, 51, 51));
        calculatorPanel.setForeground(new java.awt.Color(255, 0, 153));

        calculatorTextField.setBackground(new java.awt.Color(51, 51, 51));
        calculatorTextField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        calculatorTextField.setForeground(new java.awt.Color(255, 255, 255));
        calculatorTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calculatorTextField.setText("0");
        calculatorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorTextFieldActionPerformed(evt);
            }
        });
        calculatorTextField.addKeyListener(new java.awt.event.KeyAdapter(){
            public void keyPressed(java.awt.event.KeyEvent evt1){
                calculatorTextFieldKeyPressed(evt1);
            }
        });
        calculatorLabel.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        calculatorLabel.setForeground(new java.awt.Color(255, 255, 255));
        calculatorLabel.setText("Standard Calculator");

        divideButton.setBackground(new java.awt.Color(102, 102 , 102));
        divideButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        divideButton.setForeground(new java.awt.Color(255, 255, 255));
        divideButton.setText("÷");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        backspaceButton.setBackground(new java.awt.Color(102, 102 , 102));
        backspaceButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        backspaceButton.setForeground(new java.awt.Color(255, 255, 255));
        backspaceButton.setText("backspace");
        backspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceButtonActionPerformed(evt);
            }
        });

        equalToButton.setBackground(new java.awt.Color(102, 102 , 102));
        equalToButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        equalToButton.setForeground(new java.awt.Color(255, 255, 255));
        equalToButton.setText("=");
        equalToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalToButtonActionPerformed(evt);
            }
        });
        addButton.setBackground(new java.awt.Color(102, 102 , 102));
        addButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        subButton.setBackground(new java.awt.Color(102, 102 , 102));
        subButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        subButton.setForeground(new java.awt.Color(255, 255, 255));
        subButton.setText("-");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });
        multiplyButton.setBackground(new java.awt.Color(102, 102 , 102));
        multiplyButton.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        multiplyButton.setForeground(new java.awt.Color(255, 255, 255));
        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(102, 102 , 102));
        sixButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sixButton.setForeground(new java.awt.Color(255, 255, 255));
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        nineButton.setBackground(new java.awt.Color(102, 102 , 102));
        nineButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nineButton.setForeground(new java.awt.Color(255, 255, 255));
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        sqRootButton.setBackground(new java.awt.Color(102, 102 , 102));
        sqRootButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sqRootButton.setForeground(new java.awt.Color(255, 255, 255));
        sqRootButton.setText("√x");
        sqRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqRootButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(102, 102 , 102));
        clearButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        pointButton.setBackground(new java.awt.Color(102, 102 , 102));
        pointButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        pointButton.setForeground(new java.awt.Color(255, 255, 255));
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        threeButton.setBackground(new java.awt.Color(102, 102 , 102));
        threeButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        threeButton.setForeground(new java.awt.Color(255, 255, 255));
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        fiveButton.setBackground(new java.awt.Color(102, 102 , 102));
        fiveButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(255, 255, 255));
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        eightButton.setBackground(new java.awt.Color(102, 102 , 102));
        eightButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        eightButton.setForeground(new java.awt.Color(255, 255, 255));
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        sqButton.setBackground(new java.awt.Color(102, 102 , 102));
        sqButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sqButton.setForeground(new java.awt.Color(255, 255, 255));
        sqButton.setText("x²");
        sqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqButtonActionPerformed(evt);
            }
        });

        clearAllButton.setBackground(new java.awt.Color(102, 102 , 102));
        clearAllButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        clearAllButton.setForeground(new java.awt.Color(255, 255, 255));
        clearAllButton.setText("CE");
        clearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllButtonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(102, 102 , 102));
        zeroButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        zeroButton.setForeground(new java.awt.Color(255, 255, 255));
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        twoButton.setBackground(new java.awt.Color(102, 102 , 102));
        twoButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        twoButton.setForeground(new java.awt.Color(255, 255, 255));
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(102, 102 , 102));
        fourButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        fourButton.setForeground(new java.awt.Color(255, 255, 255));
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        sevenButton.setBackground(new java.awt.Color(102, 102 , 102));
        sevenButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(255, 255, 255));
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        bracketCButton.setBackground(new java.awt.Color(102, 102 , 102));
        bracketCButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        bracketCButton.setForeground(new java.awt.Color(255, 255, 255));
        bracketCButton.setText(")");
        bracketCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bracketCButtonActionPerformed(evt);
            }
        });

        bracketOButton.setBackground(new java.awt.Color(102, 102 , 102));
        bracketOButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        bracketOButton.setForeground(new java.awt.Color(255, 255, 255));
        bracketOButton.setText("(");
        bracketOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bracketOButtonActionPerformed(evt);
            }
        });

        factorialButton.setBackground(new java.awt.Color(102, 102 , 102));
        factorialButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        factorialButton.setForeground(new java.awt.Color(255, 255, 255));
        factorialButton.setText("x!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });
        oneButton.setBackground(new java.awt.Color(102, 102 , 102));
        oneButton.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        oneButton.setForeground(new java.awt.Color(255, 255, 255));
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calculatorTextField)
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fourButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sevenButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bracketCButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bracketOButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(factorialButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oneButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eightButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sqButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearAllButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zeroButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(twoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sixButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nineButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sqRootButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pointButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(threeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multiplyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divideButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backspaceButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(equalToButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(calculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {divideButton, clearButton, pointButton, threeButton, fiveButton, eightButton, sqButton, clearAllButton, zeroButton, twoButton, fourButton, subButton, sevenButton, bracketCButton, bracketOButton, factorialButton, oneButton, backspaceButton, equalToButton, addButton, multiplyButton, sixButton, nineButton, sqRootButton});

        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatorPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(calculatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculatorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                            .addComponent(backspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(equalToButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculatorPanelLayout.createSequentialGroup()
                            .addComponent(bracketOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bracketCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                            .addComponent(clearAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sqButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(calculatorPanelLayout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sqRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        calculatorPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {divideButton, clearButton, pointButton, threeButton, fiveButton, eightButton, sqButton, clearAllButton, zeroButton, twoButton, fourButton, subButton, sevenButton, bracketCButton, bracketOButton, factorialButton, oneButton, backspaceButton, equalToButton, addButton, multiplyButton, sixButton, nineButton, sqRootButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private void calculatorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText();
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "+";
        calculatorTextField.setText(exp);
    }

    private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "-";
        calculatorTextField.setText(exp);
    }
    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "/";
        calculatorTextField.setText(exp);
    }

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "*";
        calculatorTextField.setText(exp);
    }
    private void bracketOButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "(";
        calculatorTextField.setText(exp);
    }
    private void sqRootButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "√";
        calculatorTextField.setText(exp);
    }
    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "!";
        calculatorTextField.setText(exp);
    }
    private void bracketCButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + ")";
        calculatorTextField.setText(exp);
    }
    private void sqButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "²";
        calculatorTextField.setText(exp);
    }
    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + ".";
        calculatorTextField.setText(exp);
    }

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "0";
        calculatorTextField.setText(exp);
    }
    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "1";
        calculatorTextField.setText(exp);
    }
    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "2";
        calculatorTextField.setText(exp);
    }
    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "3";
        calculatorTextField.setText(exp);
    }
    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "4";
        calculatorTextField.setText(exp);
    }
    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "5";
        calculatorTextField.setText(exp);
    }
    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "6";
        calculatorTextField.setText(exp);
    }
    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "7";
        calculatorTextField.setText(exp);
    }
    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "8";
        calculatorTextField.setText(exp);
    }
    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText() + "9";
        calculatorTextField.setText(exp);
    }
    private void backspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText();
        exp = exp.replace(exp.substring(exp.length()-1), "");
        calculatorTextField.setText(exp);
    }
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        StringBuffer s = new StringBuffer(exp);
        while(true){
            char ch = s.charAt(s.length()-1);
            if(s.length()==1||exp == null||exp.equals('0')||ch=='+'||ch==' '||ch=='²'||ch=='√'||ch==')'||ch=='('||ch=='-'||ch=='*'||ch=='/'){
                break;
            }
            s.setLength(s.length()-1);
        }
        calculatorTextField.setText(s.toString());
    }
    
    private void clearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {
        calculatorTextField.setText("0");
    }
    private void equalToButtonActionPerformed(java.awt.event.ActionEvent evt) {
        exp = calculatorTextField.getText().replaceAll(" ", "");
        redirectMethods();
    }
    private void calculatorTextFieldKeyPressed(java.awt.event.KeyEvent evt1) {
        if (evt1.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            exp = calculatorTextField.getText().replaceAll(" ", "");
            redirectMethods();
        }
    }
    void redirectMethods(){
        op = new char[(exp.length()/2)];
        num = new float[(exp.length()/2) + 1];
        index = new int[(exp.length()/2)];
        solveBracket();
        if (error == 0){
            seperate(exp);
            cal('/');                       
            cal('*');                       
            cal('+');                   
            cal('-');
            calculatorTextField.setText(String.valueOf(result));
        }
        else{
            calculatorTextField.setText("Error!");
        }
    }
    void solveBracket(){
        StringBuffer s = new StringBuffer(exp);
        while (true){
            String bo ="(", bc = ")";
            String subStr;
            if (s.toString().contains(bo)){
                int first = s.indexOf(bo)+1;
                int last = s.indexOf(bc);
                subStr = s.substring(first, last);
            int first1 = 0;
            while (true){ 
                    if (subStr.contains(bo)){
                    first1 = subStr.indexOf(bo) + 1;
                    subStr = subStr.substring(first1);
                    }
                    else{
                        seperate(s.toString());
                        cal('/');                       
                        cal('*');                       
                        cal('+');                   
                        cal('-');
                        s = s.replace(first+first1-1, last+1, String.valueOf(result));
                        System.out.println(s);
                        break;
                    }
                }
            }
            else{
                exp = s.toString();
                break;
            }
        }
    }
    
    void seperate(String expression){ 
        int i,j,k,f=0;   
        expression = expression.replace(" ", "");
        try{
outer:      for( i=0,j=0,k=0;i<expression.length();i++,j++){
                char ch = expression.charAt(i);
                float temp=0;
                int l=-1;
loop:           for(;i<expression.length();i++){
                    ch=expression.charAt(i);
                    if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                        op[k]=ch;
                        f=0;
                        k++;
                        break loop;
                    }   
                    else{
                        if(ch=='.'){
                        f=1;
                        i++;
                        ch=expression.charAt(i);
                        }
                        else if(ch == '!'){
                            if(num[j-1] == (int)num[j-1]){
                                num[j-1] = fact((int)num[j-1]);
                                f=0;
                                break loop;
                            }
                            else{
                                error = 1;
                                break outer;
                            }
                        }
                        else if(ch == '²'){
                            num[j-1] = num[j-1] * num[j-1];
                            f=0;
                            break loop;
                        }
                        else if(ch == '√'){
                            if(num[j-1]<0){
                                error = 1;
                                break outer;
                            }
                            else
                                num[j-1] = (float)Math.pow(num[j-1], 0.5);
                                f=0;
                                break loop;
                        }
                        if(f==1){                       
                            temp += (Character.getNumericValue(ch)*Math.pow(10, l));
                            l--;
                        }
                        else{
                            temp = temp*10 + Character.getNumericValue(ch);
                        }
                    }
                }
                num[j]= temp;
            }
        }catch(Exception e1){
            error = 1;
        }
    }
    long fact(int num){
        return num * fact(num-1);
    }
   
    void cal(char sign){
        int flag =0;
        for(int i=0;i<op.length;i++){
            if(sign == op[i]){
                index[flag]=i;
                flag++;
            }
        }
        freq = flag;
        if(sign == '/'){
            for(int i=0;i<freq;i++){
                result =  (num[index[i]]/num[index[i]+1]);
                num[index[i]]=result;
                num[index[i]+1]= result; 
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        else if(sign == '*'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]*num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
    
        }
        else if(sign == '-'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]-num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*' || op[n] == '-'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/' || op[n] == '*'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        else if(sign == '+'){
            for(int i=0;i<freq;i++){
                result = num[index[i]]+num[index[i]+1];
                num[index[i]]=result;
                num[index[i]+1]= result;
                try{
                    int n = index[i] - 1;
                    while(true){
                        if(op[n] == '/' || op[n] == '*' || op[n] == '-' || op[n] == '+'){
                            num[n]= result;
                            n--;
                        }
                        else{
                            break;
                        }
                    }
                }catch (ArrayIndexOutOfBoundsException exp){}
            try{
                int n = index[i] + 1;
                while(true){
                    if(op[n] == '/' || op[n] == '*' || op[n] == '-'){
                        num[n+1]= result;
                        n++;
                    }
                    else{
                        break;
                    }
                }
            }catch (ArrayIndexOutOfBoundsException exp){}
            }
        }
        else{
            result = num[0];
        }
    }

    

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton divideButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton sqButton;
    private javax.swing.JButton clearAllButton;
    private javax.swing.JButton zeroButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton subButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton bracketCButton;
    private javax.swing.JButton bracketOButton;
    private javax.swing.JButton factorialButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton backspaceButton;
    private javax.swing.JButton equalToButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton sqRootButton;
    private javax.swing.JLabel calculatorLabel;
    private javax.swing.JPanel calculatorPanel;
    private javax.swing.JTextField calculatorTextField;
    String exp;
    char sign;
    float[] num;
    int[] index;
    char[] op;
    int freq;
    float result;
    int error = 0 ;
}
