import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.io.IOException;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.image.BufferedImage;

public class Login {
    static String status = "VALORANT";

    public static void main(String[] args) throws FileNotFoundException {

        JFrame frame = new JFrame();
        Image riot = Toolkit.getDefaultToolkit().getImage(".//images//riot.png");
        frame.setIconImage(riot);
        frame.setTitle("Riot Client");
        frame.setBounds(50, 15, 1280, 720);

        JLabel valorant = new JLabel();
        ImageIcon valo = new ImageIcon(".//images//valorant5.png");
        valorant.setIcon(valo);
        valorant.setOpaque(true);
        valorant.setSize(1280, 720);

        JLabel loginDetails = new JLabel();
        loginDetails.setOpaque(true);
        loginDetails.setBackground(Color.decode("#F9F9F9"));
        loginDetails.setSize(400, 720);
        loginDetails.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                loginDetails.requestFocusInWindow();

            }
        });

        JLabel vLogo = new JLabel();
        ImageIcon logo = new ImageIcon(".//images//v_logo1.jpg");
        vLogo.setIcon(logo);
        vLogo.setOpaque(true);
        vLogo.setBounds(175, 60, 50, 41);

        JLabel signIn = new JLabel("Sign in");
        signIn.setFont(new Font("TT Hoves Bold", Font.BOLD, 26));
        signIn.setBounds(160, 155, 100, 40);

        JLabel user = new JLabel("USERNAME");
        user.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        user.setOpaque(true);
        user.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 10));
        user.setForeground(Color.decode("#8F8F8F"));
        user.setBackground(Color.decode("#EDEDED"));
        user.setBounds(50, 220, 300, 18);

        JTextField username = new JTextField();
        username.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        username.setBackground(Color.decode("#EDEDED"));
        username.setFont(new Font("TT Hoves DemiBold", Font.PLAIN, 18));
        username.setBounds(50, 238, 300, 27);

        JLabel pwd = new JLabel("PASSWORD");
        pwd.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        pwd.setOpaque(true);
        pwd.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 10));
        pwd.setForeground(Color.decode("#8F8F8F"));
        pwd.setBackground(Color.decode("#EDEDED"));
        pwd.setBounds(50, 280, 300, 18);

        JPasswordField password = new JPasswordField();
        password.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        password.setBackground(Color.decode("#EDEDED"));
        password.setFont(new Font("DIN Next LT Arabic", Font.PLAIN, 18));
        password.setBounds(50, 298, 300, 27);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

        JButton facebook = new JButton();
        ImageIcon fb_logo = new ImageIcon(".//images//facebook-logo1.png");
        facebook.setIcon(fb_logo);
        facebook.setBounds(50, 353, 90, 32);
        facebook.setFocusPainted(false);
        facebook.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        facebook.setBackground(Color.decode("#1877F2"));
        facebook.setCursor(cursor);
        facebook.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                facebook.setBackground(Color.decode("#0966DE"));
            }

            public void mouseExited(MouseEvent e) {
                facebook.setBackground(Color.decode("#1877F2"));
            }
        });
        facebook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(
                            "https://authenticate.riotgames.com/login?method=facebook&code_challenge=aBsSctmQiFlJPbzp3QTBYoI-X0NUP3TLcJwpAY9bsG8&redirect_uri=riotclient%3A%2F%2Fauth%2Fv1%2F%7Blogin_token%7D&locale=en_US&client_id=riot-client&remember=false&riot_theme=valorant&riotclient_product_id=valorant&riotclient_patchline=KeystoneFoundationLiveWin&riotclient_session_id=f54e32a5-0908-b145-889d-5ca055fac05a&sdk_version=21.10.2.3805955&platform=windows"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        });

        JButton google = new JButton();
        ImageIcon google_logo = new ImageIcon(".//images//google-logo.png");
        google.setIcon(google_logo);
        google.setBounds(155, 353, 90, 32);
        google.setBorder(new LineBorder(Color.decode("#EDEDED")));
        google.setBackground(Color.white);
        google.setFocusPainted(false);
        google.setCursor(cursor);
        google.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                google.setBackground(Color.decode("#F7F7F7"));
            }

            public void mouseExited(MouseEvent e) {
                google.setBackground(Color.white);
            }
        });
        google.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(
                            "https://authenticate.riotgames.com/login?method=google&code_challenge=MsiLpkAey18G8dskVslcZPzIZ6XI9CSWcMHpDIi_ibA&redirect_uri=riotclient%3A%2F%2Fauth%2Fv1%2F%7Blogin_token%7D&locale=en_US&client_id=riot-client&remember=false&riot_theme=valorant&riotclient_product_id=valorant&riotclient_patchline=KeystoneFoundationLiveWin&riotclient_session_id=f54e32a5-0908-b145-889d-5ca055fac05a&sdk_version=21.10.2.3805955&platform=windows"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        JButton apple = new JButton();
        ImageIcon apple_logo = new ImageIcon(".//images//apple-logo1.png");
        apple.setIcon(apple_logo);
        apple.setBounds(260, 353, 90, 32);
        apple.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        apple.setBackground(Color.black);
        apple.setFocusPainted(false);
        apple.setCursor(cursor);
        apple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create(
                            "https://authenticate.riotgames.com/login?method=apple&code_challenge=OvyzdTBhiJw2rYBXZpt2aSl2QOdUKOfIFeZPrlMwLlg&redirect_uri=riotclient%3A%2F%2Fauth%2Fv1%2F%7Blogin_token%7D&locale=en_US&client_id=riot-client&remember=false&riot_theme=valorant&riotclient_product_id=valorant&riotclient_patchline=KeystoneFoundationLiveWin&riotclient_session_id=f54e32a5-0908-b145-889d-5ca055fac05a&sdk_version=21.10.2.3805955&platform=windows"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        JCheckBox stay = new JCheckBox("  Stay signed in");
        stay.setFont(new Font("TT Hoves DemiBold", Font.PLAIN, 13));
        stay.setBounds(46, 395, 304, 20);
        stay.setForeground(Color.decode("#8F8F8F"));
        stay.setBackground(Color.decode("#F9F9F9"));
        stay.setSelectedIcon(new ImageIcon(".//images//checkbox-selected.png"));
        stay.setIcon(new ImageIcon(".//images//checkbox.png"));
        stay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (stay.isSelected() == false)
                    stay.setForeground(Color.decode("#8F8F8F"));
                else
                    stay.setForeground(Color.black);
            }
        });
        stay.setOpaque(true);
        stay.setFocusPainted(false);
        stay.setCursor(cursor);

        JButton submit = new JButton();
        ImageIcon submitEnabled = new ImageIcon(".//images//submit-enabled.png");
        ImageIcon submitDisabled = new ImageIcon(".//images//submit-disabled.png");
        submit.setDisabledIcon(submitDisabled);
        submit.setIcon(submitEnabled);
        submit.setContentAreaFilled(false);
        submit.setBorder(null);
        submit.setBounds(168, 511, 64, 64);
        submit.setEnabled(false);
        // submit.setCursor(cursor);

        JButton signInIssue = new JButton("CAN'T SIGN IN?");
        signInIssue.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        signInIssue.setForeground(Color.decode("#B0B0B0"));
        signInIssue.setBounds(155, 640, 90, 11);
        signInIssue.setBorder(null);
        signInIssue.setCursor(cursor);
        signInIssue.setBorderPainted(false);
        signInIssue.setContentAreaFilled(false);
        signInIssue.setFocusPainted(false);
        signInIssue.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                signInIssue.setForeground(Color.black);
            }

            public void mouseExited(MouseEvent e) {
                signInIssue.setForeground(Color.decode("#B0B0B0"));
            }
        });
        signInIssue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create("https://recovery.riotgames.com/en?region=NA1"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        JButton createAccount = new JButton("CREATE ACCOUNT");
        createAccount.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        createAccount.setForeground(Color.decode("#B0B0B0"));
        createAccount.setBounds(148, 657, 110, 11);
        createAccount.setBorder(null);
        createAccount.setCursor(cursor);
        createAccount.setBorderPainted(false);
        createAccount.setContentAreaFilled(false);
        createAccount.setFocusPainted(false);
        createAccount.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                createAccount.setForeground(Color.black);
            }

            public void mouseExited(MouseEvent e) {
                createAccount.setForeground(Color.decode("#B0B0B0"));
            }
        });
        createAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(java.net.URI.create("https://playvalorant.com/en-gb/"));
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        JLabel mask = new JLabel();
        mask.setBounds(0, 0, 1280, 720);
        mask.setBackground(new Color(0, 0, 0, 10));
        mask.setBorder(null);
        // mask.setBorderPainted(false);
        // mask.setContentAreaFilled(false);

        JButton version = new JButton("V0.0.1");
        version.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        version.setForeground(Color.decode("#CBCBCB"));
        version.setBorder(null);
        version.setCursor(cursor);
        version.setBorderPainted(false);
        version.setContentAreaFilled(false);
        version.setFocusPainted(false);
        version.setBounds(305, 660, 47, 11);
        version.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                version.setForeground(Color.decode("#8E7E7E"));
            }

            public void mouseExited(MouseEvent e) {
                version.setForeground(Color.decode("#CBCBCB"));
            }
        });

        JLabel ver = new JLabel();
        ver.setBackground(Color.BLACK);
        ver.setBounds(412, 194, 455, 330);
        ver.setOpaque(false);

        JLabel whiteVer = new JLabel("v0.0.1");
        whiteVer.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 27));
        whiteVer.setBackground(Color.BLACK);
        whiteVer.setForeground(Color.WHITE);
        whiteVer.setBounds(460, 235, 100, 40);

        JTextArea info = new JTextArea("Foundation: XXXXXXXX \nUX: XXXXXXXX \nSDK: X.X.X.X");
        info.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 17));
        info.setBackground(Color.BLACK);
        info.setForeground(Color.WHITE);
        info.setBorder(null);
        info.setCaretColor(Color.BLACK);
        info.setSelectedTextColor(Color.WHITE);
        info.setSelectionColor(Color.decode("#0360CF"));
        info.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        info.setEditable(false);
        info.setBounds(460, 322, 205, 65);

        JButton okay = new JButton("Okay");
        okay.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 18));
        okay.setBackground(Color.decode("#D13639"));
        okay.setForeground(Color.WHITE);
        okay.setBorder(null);
        okay.setCursor(cursor);
        okay.setFocusPainted(false);
        okay.setBounds(530, 427, 210, 48);
        okay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                okay.setBackground(Color.decode("#BC252A"));
            }

            public void mouseExited(MouseEvent e) {
                okay.setBackground(Color.decode("#D13639"));
            }
        });

        JButton closeVer = new JButton();
        ImageIcon closeVerImg = new ImageIcon(".//images//close-ver3.png");
        closeVer.setIcon(closeVerImg);
        closeVer.setBounds(830, 207, 24, 24);
        closeVer.setBorder(null);
        closeVer.setCursor(cursor);
        closeVer.setFocusPainted(false);

        JButton settings = new JButton();
        ImageIcon settingsImage = new ImageIcon(".//images//settings2.png");
        settings.setIcon(settingsImage);
        settings.setBounds(1208, 647, 32, 32);
        settings.setBorder(null);
        settings.setCursor(cursor);
        settings.setFocusPainted(false);

        JLabel labelBlack = new JLabel();
        labelBlack.setBounds(0, 0, 1080, 720);
        labelBlack.setBackground(Color.decode("#111111"));
        labelBlack.setOpaque(true);

        JLabel riotLabel = new JLabel();
        ImageIcon riotIcon = new ImageIcon(".//images//riot2.png");
        riotLabel.setIcon(riotIcon);
        riotLabel.setBounds(48, 40, 49, 49);

        JLabel settingsHeader = new JLabel("SETTINGS");
        settingsHeader.setFont(new Font("Typeold Condensed", Font.BOLD, 25));
        settingsHeader.setForeground(Color.decode("#DCE8E8"));
        settingsHeader.setBounds(499, 71, 450, 20);

        JButton general_option = new JButton("GENERAL");
        general_option.setBackground(Color.decode("#111111"));
        general_option.setForeground(Color.decode("#7E7E7E"));
        general_option.setBounds(48, 118, 78, 30);
        general_option.setBorder(null);
        general_option.setCursor(cursor);
        general_option.setContentAreaFilled(false);
        general_option.setFocusPainted(false);
        general_option.setHorizontalAlignment(SwingConstants.LEFT);
        general_option.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 16));

        JButton valorant_option = new JButton("VALORANT");
        valorant_option.setBackground(Color.decode("#111111"));
        valorant_option.setForeground(Color.decode("#D13639"));
        valorant_option.setBounds(48, 148, 89, 30);
        valorant_option.setCursor(cursor);
        valorant_option.setBorder(null);
        valorant_option.setContentAreaFilled(false);
        valorant_option.setFocusPainted(false);
        valorant_option.setHorizontalAlignment(SwingConstants.LEFT);
        valorant_option.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 16));

        JButton third_party = new JButton("THIRD PARTY");
        third_party.setBackground(Color.decode("#111111"));
        third_party.setForeground(Color.decode("#7E7E7E"));
        third_party.setBounds(48, 660, 67, 13);
        third_party.setCursor(cursor);
        third_party.setBorder(null);
        third_party.setContentAreaFilled(false);
        third_party.setFocusPainted(false);
        third_party.setHorizontalAlignment(SwingConstants.LEFT);
        third_party.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 10));

        JLabel current_patchline = new JLabel("CURRENT PATCHLINE");
        current_patchline.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        current_patchline.setForeground(Color.decode("#DCE8E8"));
        current_patchline.setBounds(499, 140, 150, 20);

        String patches[] = { "    LIVE" };
        JComboBox<String> patchline = new JComboBox<String>(patches);
        patchline.setBackground(Color.decode("#232323"));
        patchline.setForeground(Color.decode("#DCE8E8"));
        patchline.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 13));
        patchline.setFocusable(false);
        patchline.setBounds(499, 162, 430, 45);

        JLabel game_language = new JLabel("GAME LANGUAGE");
        game_language.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        game_language.setForeground(Color.decode("#DCE8E8"));
        game_language.setBounds(499, 237, 150, 20);

        JLabel client_language = new JLabel("RIOT CLIENT LANGUAGE");
        client_language.setFont(new Font("TT Hoves ExtraBold", Font.BOLD, 11));
        client_language.setForeground(Color.decode("#DCE8E8"));
        client_language.setBounds(499, 140, 150, 20);

        String languages[] = { "    English" };
        JComboBox<String> languagesBox = new JComboBox<String>(languages);
        languagesBox.setBackground(Color.decode("#232323"));
        languagesBox.setForeground(Color.decode("#DCE8E8"));
        languagesBox.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 13));
        languagesBox.setFocusable(false);
        languagesBox.setBounds(499, 257, 430, 45);

        JComboBox<String> clientLanguageBox = new JComboBox<String>(languages);
        clientLanguageBox.setBackground(Color.decode("#232323"));
        clientLanguageBox.setForeground(Color.decode("#DCE8E8"));
        clientLanguageBox.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 13));
        clientLanguageBox.setFocusable(false);
        clientLanguageBox.setBounds(499, 162, 430, 45);

        File file = new File(".//licenses.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");

        JTextArea license = new JTextArea(sc.next());
        JScrollPane scrollPane = new JScrollPane(license);
        license.setBackground(Color.decode("#111111"));
        license.setForeground(Color.decode("#f9f9f9"));
        license.setLineWrap(true);
        license.setAutoscrolls(true);
        license.setEditable(false);
        license.setHighlighter(null);
        license.setFont(new Font("TT Hoves DemiBold", Font.BOLD, 12));
        // license.setBounds(499, 140, 550, 535);
        scrollPane.setBounds(499, 140, 550, 535);
        scrollPane.setBorder(null);
        
        sc.close();

        JButton closeSettings = new JButton();
        ImageIcon closeSettingsImg = new ImageIcon(".//images//close-unhover.png");
        ImageIcon closeSettingsImgHover = new ImageIcon(".//images//close-hover1.png");
        closeSettings.setIcon(closeSettingsImg);
        closeSettings.setBorder(null);
        closeSettings.setCursor(cursor);
        closeSettings.setFocusPainted(false);
        closeSettings.setContentAreaFilled(false);
        closeSettings.setBounds(1080, 0, 200, 720);

        JLabel closeSettingsMask = new JLabel();
        closeSettingsMask.setBackground(new Color(0, 0, 0, 20));
        closeSettingsMask.setOpaque(false);
        closeSettingsMask.setBounds(1080, 0, 200, 720);

        JLayeredPane bg = new JLayeredPane();
        bg.setBounds(0, 0, 1280, 720);
        bg.add(valorant, Integer.valueOf(0));
        bg.add(loginDetails, Integer.valueOf(1));
        bg.add(vLogo, Integer.valueOf(2));
        bg.add(signIn, Integer.valueOf(2));
        bg.add(user, Integer.valueOf(2));
        bg.add(username, Integer.valueOf(2));
        bg.add(pwd, Integer.valueOf(2));
        bg.add(password, Integer.valueOf(2));
        bg.add(facebook, Integer.valueOf(2));
        bg.add(google, Integer.valueOf(2));
        bg.add(apple, Integer.valueOf(2));
        bg.add(stay, Integer.valueOf(2));
        bg.add(submit, Integer.valueOf(2));
        bg.add(signInIssue, Integer.valueOf(2));
        bg.add(createAccount, Integer.valueOf(2));
        bg.add(version, Integer.valueOf(2));
        bg.add(settings, Integer.valueOf(1));

        username.addKeyListener(new KeyAdapter() {
            char[] pass = password.getPassword();
            String pass1 = String.valueOf(pass);
            String usernameString = new String(username.getText());
            
            public void keyReleased(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
            public void keyTyped(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
            public void keyPressed(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
        });
        password.addKeyListener(new KeyAdapter() {
            char[] pass = password.getPassword();
            String pass1 = String.valueOf(pass);
            String usernameString = new String(username.getText());
            public void keyPressed(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {                    
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
            public void keyReleased(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
            public void keyTyped(KeyEvent k) {
                pass = password.getPassword();
                pass1 = String.valueOf(pass);
                usernameString = username.getText().toString();
                
                if(!pass1.isEmpty() && !usernameString.isEmpty()) {
                    submit.setEnabled(true);
                    submit.setCursor(cursor);
                }
                else {
                    submit.setEnabled(false);
                    submit.setCursor(null);
                }
            }
        });

        version.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ver.setOpaque(true);
                mask.setOpaque(true);
                closeVer.setOpaque(true);
                ver.setVisible(true);
                mask.setVisible(true);
                closeVer.setVisible(true);
                bg.add(mask, Integer.valueOf(3));
                bg.add(ver, Integer.valueOf(4));
                bg.add(whiteVer, Integer.valueOf(5));
                bg.add(info, Integer.valueOf(5));
                bg.add(okay, Integer.valueOf(5));
                bg.add(closeVer, Integer.valueOf(5));
            }
        });
        okay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mask.setOpaque(false);
                ver.setOpaque(false);
                closeVer.setOpaque(false);
                mask.setVisible(false);
                ver.setVisible(false);
                closeVer.setVisible(false);
                bg.remove(mask);
                bg.remove(ver);
                bg.remove(whiteVer);
                bg.remove(info);
                bg.remove(okay);
                bg.remove(closeVer);
                bg.revalidate();
            }
        });
        closeVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mask.setOpaque(false);
                ver.setOpaque(false);
                closeVer.setOpaque(false);
                mask.setVisible(false);
                ver.setVisible(false);
                closeVer.setVisible(false);
                bg.remove(mask);
                bg.remove(ver);
                bg.remove(whiteVer);
                bg.remove(info);
                bg.remove(okay);
                bg.remove(closeVer);
                bg.revalidate();
            }
        });
        closeSettings.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                closeSettings.setIcon(closeSettingsImgHover);

                Image img = ((ImageIcon) valorant.getIcon()).getImage();

                BufferedImage buffered = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                buffered.getGraphics().drawImage(img, 0, 0, null);

                for (int i = 0; i < buffered.getWidth(); i++) {
                    for (int j = 0; j < buffered.getHeight(); j++) {                    
                        int rgb = buffered.getRGB(i, j);
                        int alpha = (rgb >> 24) & 0x000000FF;
                        Color c = new Color(rgb);
                        if (alpha != 0) {
                            int red = (c.getRed() - 10) <= 0 ? 0 : c.getRed() - 10;
                            int green = (c.getGreen() - 10) <= 0 ? 0 : c.getGreen() - 10;
                            int blue = (c.getBlue() - 10) <= 0 ? 0 : c.getBlue() - 10;
                            c = new Color(red, green, blue);
                            buffered.setRGB(i, j, c.getRGB());
                        }
                    }
                }
                valorant.setIcon(new ImageIcon(buffered));
            }
            public void mouseExited(MouseEvent e) {
                closeSettings.setIcon(closeSettingsImg);
                // closeSettingsMask.setOpaque(false);
                valorant.setIcon(valo);
                // closeSettingsMask.setBackground(new Color(0, 0, 0, 100));
            }
        });
        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // loginDetails.setVisible(false);
                // vLogo.setVisible(false);
                // signIn.setVisible(false);
                // user.setVisible(false);
                // username.setVisible(false);
                // pwd.setVisible(false);
                // password.setVisible(false);
                // facebook.setVisible(false);
                // google.setVisible(false);
                // apple.setVisible(false);
                // stay.setVisible(false);
                // signInIssue.setVisible(false);
                // createAccount.setVisible(false);
                // version.setVisible(false);
                // settings.setVisible(false);
                version.setBounds(265, 670, 47, 11);
                version.setForeground(Color.decode("#313131"));
                version.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        version.setForeground(Color.decode("#8E7E7E"));
                    }
        
                    public void mouseExited(MouseEvent e) {
                        version.setForeground(Color.decode("#313131"));
                    }
                });

                bg.add(labelBlack, Integer.valueOf(1));
                bg.add(riotLabel, Integer.valueOf(2));
                bg.add(settingsHeader, Integer.valueOf(2));
                bg.add(general_option, Integer.valueOf(2));
                bg.add(valorant_option, Integer.valueOf(2));
                bg.add(patchline, Integer.valueOf(2));
                bg.add(current_patchline, Integer.valueOf(2));
                bg.add(game_language, Integer.valueOf(2));
                bg.add(languagesBox, Integer.valueOf(2));
                bg.add(third_party, Integer.valueOf(2));
                bg.add(closeSettingsMask, Integer.valueOf(1));
                bg.add(closeSettings, Integer.valueOf(2));

                general_option.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        if (status != "GENERAL")
                            general_option.setForeground(Color.white);
                    }

                    public void mouseExited(MouseEvent e) {
                        if (status == "VALORANT" || status == "THIRD")
                            general_option.setForeground(Color.decode("#7E7E7E"));
                        else
                            general_option.setForeground(Color.decode("#D13639"));
                    }
                });
                general_option.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (status == "VALORANT" || status == "THIRD") {
                            status = "GENERAL";
                            general_option.setForeground(Color.decode("#D13639"));
                            valorant_option.setForeground(Color.decode("#7E7E7E"));
                            third_party.setForeground(Color.decode("#7E7E7E"));
                            settingsHeader.setText("SETTINGS");
                            // bg.add(settingsBlack, Integer.valueOf(2));
                            bg.remove(scrollPane);
                            bg.remove(patchline);
                            bg.remove(current_patchline);
                            bg.remove(game_language);
                            bg.remove(languagesBox);
                            bg.add(client_language, Integer.valueOf(2));
                            bg.add(clientLanguageBox, Integer.valueOf(2));
                            bg.repaint();
                        }
                    }
                });
                valorant_option.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        if (status != "VALORANT")
                            valorant_option.setForeground(Color.white);
                    }

                    public void mouseExited(MouseEvent e) {
                        if (status == "GENERAL" || status == "THIRD")
                            valorant_option.setForeground(Color.decode("#7E7E7E"));
                        else
                            valorant_option.setForeground(Color.decode("#D13639"));
                    }
                });
                valorant_option.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (status == "GENERAL" || status == "THIRD") {
                            status = "VALORANT";
                            general_option.setForeground(Color.decode("#7E7E7E"));
                            valorant_option.setForeground(Color.decode("#D13639"));
                            third_party.setForeground(Color.decode("#7E7E7E"));
                            settingsHeader.setText("SETTINGS");
                            // bg.add(settingsBlack, Integer.valueOf(2));
                            bg.remove(scrollPane);
                            bg.add(patchline, Integer.valueOf(2));
                            bg.add(current_patchline, Integer.valueOf(2));
                            bg.add(game_language, Integer.valueOf(2));
                            bg.add(languagesBox, Integer.valueOf(2));
                            bg.remove(client_language);
                            bg.remove(clientLanguageBox);
                            bg.repaint();
                        }
                    }
                });
                third_party.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e)
                    {
                        if(status != "THIRD")
                            third_party.setForeground(Color.white);
                    }
                    public void mouseExited(MouseEvent e)
                    {
                        if(status == "GENERAL" || status == "VALORANT")
                            third_party.setForeground(Color.decode("#7E7E7E"));
                        else
                            third_party.setForeground(Color.decode("#D13639"));
                    }
                });
                third_party.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        if(status == "VALORANT" || status == "GENERAL"){
                            status = "THIRD";
                            third_party.setForeground(Color.decode("#D13639"));
                            general_option.setForeground(Color.decode("#7E7E7E"));
                            valorant_option.setForeground(Color.decode("#7E7E7E"));
                            // bg.add(license, Integer.valueOf(2));
                            // bg.remove(settingsBlack);
                            settingsHeader.setText("THIRD PARTY SOFTWARE LICENSES");
                            bg.remove(client_language);
                            bg.remove(clientLanguageBox);
                            bg.remove(patchline);
                            bg.remove(current_patchline);
                            bg.remove(game_language);
                            bg.remove(languagesBox);
                            bg.add(scrollPane, Integer.valueOf(2));
                            bg.repaint();
                        }
                    }
                });
                bg.remove(loginDetails);
                bg.remove(vLogo);
                bg.remove(signIn);
                bg.remove(user);
                bg.remove(username);
                bg.remove(pwd);
                bg.remove(password);
                bg.remove(facebook);
                bg.remove(google);
                bg.remove(apple);
                bg.remove(stay);
                bg.remove(signInIssue);
                bg.remove(createAccount);
                bg.remove(settings);
                bg.remove(submit);
                bg.repaint();
            }
        });
        closeSettings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                version.setBounds(305, 660, 47, 11);
                version.setForeground(Color.decode("#CBCBCB"));
                version.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e) {
                        version.setForeground(Color.decode("#8E7E7E"));
                    }

                    public void mouseExited(MouseEvent e) {
                        version.setForeground(Color.decode("#CBCBCB"));
                    }
                });
                bg.remove(labelBlack);
                bg.remove(riotLabel);
                bg.remove(settingsHeader);
                bg.remove(general_option);
                bg.remove(valorant_option);
                bg.remove(patchline);
                bg.remove(current_patchline);
                bg.remove(game_language);
                bg.remove(languagesBox);
                bg.remove(third_party);
                bg.remove(closeSettingsMask);
                bg.remove(closeSettings);
                bg.remove(client_language);
                bg.remove(clientLanguageBox);
                bg.remove(scrollPane);
                bg.add(loginDetails, Integer.valueOf(1));
                bg.add(vLogo, Integer.valueOf(2));
                bg.add(signIn, Integer.valueOf(2));
                bg.add(user, Integer.valueOf(2));
                bg.add(username, Integer.valueOf(2));
                bg.add(pwd, Integer.valueOf(2));
                bg.add(password, Integer.valueOf(2));
                bg.add(facebook, Integer.valueOf(2));
                bg.add(google, Integer.valueOf(2));
                bg.add(apple, Integer.valueOf(2));
                bg.add(stay, Integer.valueOf(2));
                bg.add(signInIssue, Integer.valueOf(2));
                bg.add(createAccount, Integer.valueOf(2));
                bg.add(settings, Integer.valueOf(1));
                bg.add(submit, Integer.valueOf(2));
                bg.repaint();
                status = "VALORANT";
                valorant_option.setForeground(Color.decode("#D13639"));
                general_option.setForeground(Color.decode("#7E7E7E"));
                third_party.setForeground(Color.decode("#7E7E7E"));
            }
        });

        frame.add(bg);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}