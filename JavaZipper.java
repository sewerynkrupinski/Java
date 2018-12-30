
package javazipper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.*;



public class JavaZipper extends JFrame
{
    public JavaZipper()
    {
        this.setTitle("Java Zipper");
        this.setBounds(250, 400, 300, 400);
        this.setJMenuBar(pasekMenu);
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        
        Action akcjaDodawania = new Akcja("Dodaj", "Dodaj nowy wpis do archiwum", "ctrl D", new ImageIcon("dodaj.png"));
        Action akcjaUsuwania = new Akcja("Usuń", "Usuń wpis z archiwum", "ctrl U", new ImageIcon("usun.png"));
        Action akcjaZipowania = new Akcja("Zipuj", "Zipuj!", "ctrl Z");
        
        JMenuItem menuOtworz = menuPlik.add(akcjaDodawania);
        JMenuItem menuUsun = menuPlik.add(akcjaUsuwania);
        JMenuItem menuZipuj = menuPlik.add(akcjaZipowania);
        
        
        bDodaj = new JButton(akcjaDodawania);
        bUsun = new JButton(akcjaUsuwania);
        bZip = new JButton(akcjaZipowania);
        JScrollPane scrollek = new JScrollPane(lista);
        
        lista.setBorder(BorderFactory.createEtchedBorder());
        
        GroupLayout layout = new GroupLayout(this.getContentPane());
        
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(scrollek, 100, 150, Short.MAX_VALUE)
                .addContainerGap(0, Short.MAX_VALUE)
                .addGroup(
                layout.createParallelGroup()
                        .addComponent(bDodaj)
                        .addComponent(bUsun)
                        .addComponent(bZip)
                )
        );
        
        layout.setVerticalGroup(
                layout.createParallelGroup()
                .addComponent(scrollek, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(
                layout.createSequentialGroup()
                        .addComponent(bDodaj)
                        .addComponent(bUsun)
                        .addGap(5, 40, Short.MAX_VALUE)
                        .addComponent(bZip)
                
                
                
                )
        
        
        
        );
        
        
        
        
        
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    private DefaultListModel modelListy = new DefaultListModel()
    {
        @Override
        public void addElement(Object obj) 
        {
            lista.add(obj);
            super.addElement(((File)obj).getName());
            
        }
        
        @Override
        public Object get(int index) 
        {
        return lista.get(index);
        }
        
        @Override
        public Object remove(int index)
        {
            
            lista.remove(index);
            return super.remove(index);
        }
        
        ArrayList lista = new ArrayList();
        
        
        
    };
    private JList lista = new JList(modelListy);
    private JButton bDodaj;
    private JButton bUsun;
    private JButton bZip;
    private JMenuBar pasekMenu = new JMenuBar();
    private JFileChooser wybieracz = new JFileChooser();
   
    public static void main(String[] args) {
        
        new JavaZipper().setVisible(true);
        
    }
    
    public class Akcja extends AbstractAction
    {
        public Akcja (String nazwa, String opis, String skrotKlawiaturowy)
        {
            this.putValue(Action.NAME, nazwa);
            this.putValue(Action.SHORT_DESCRIPTION, opis);
            this.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(skrotKlawiaturowy));
            
        }
        
        public Akcja (String nazwa, String opis, String skrotKlawiaturowy, Icon ikona)
        {
            this(nazwa, opis, skrotKlawiaturowy);
            this.putValue(Action.SMALL_ICON, ikona);
            
        }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getActionCommand().equals("Dodaj"))
                //System.out.println("Dodawanie");
                dodajWpisyDoArchiwum();
            else if (e.getActionCommand().equals("Usuń"))
                usunWpisyZListy();
                //System.out.println("Usuwanie");
            else if(e.getActionCommand().equals("Zipuj"))
                stworzArchiwumZip();
                //System.out.println("Zipowanie");
        }
        
        private void dodajWpisyDoArchiwum()
        {
            wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
            wybieracz.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            wybieracz.setMultiSelectionEnabled(true);
            int tmp = wybieracz.showDialog(rootPane, "Wybierz pliki do zarchiwizowania");
            
            if (tmp == JFileChooser.APPROVE_OPTION)
            {
                File[] wybrane = wybieracz.getSelectedFiles();
                
                 for (int i = 0; i<wybrane.length; i++)
                    if (!czyWpisSiePowtarza(wybrane[i].getPath()))
                     modelListy.addElement(wybrane[i]);
            
                 
            }
            
           
            
        }
        
        private boolean czyWpisSiePowtarza(String testowanyWpis)
        {
            for (int i = 0; i < modelListy.getSize(); i++)
                if (((File)modelListy.get(i)).getPath().equals(testowanyWpis))
                        return true;
           
            return false;
        }
        
        private void usunWpisyZListy()
        {
            int[] tmp = lista.getSelectedIndices();
            
            for (int i = 0; i < tmp.length; i ++)
                modelListy.remove(tmp[i]-i);
        }
        
        private void stworzArchiwumZip()
        {
            wybieracz.setCurrentDirectory(new File(System.getProperty("user.dir")));
            wybieracz.setSelectedFile(new File(System.getProperty("user.dir")+File.separator+"mojearchwium.zip"));
            int tmp = wybieracz.showDialog(rootPane, "Kompresuj");
            
            if (tmp == JFileChooser.APPROVE_OPTION)
            {
            
          //  String tab[] = new String[] {"manifest.mf", "build.xml", "Profilowe.jpg"};
        
        byte tmpData[] = new byte[BUFFOR];
        
        try
        {
            
        ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(wybieracz.getSelectedFile())));
        
            for (int i = 0; i < modelListy.getSize(); i++)
            {
                if (!((File)modelListy.get(i)).isDirectory())
                zipuj(zOutS, (File)modelListy.get(i), tmpData, ((File)modelListy.get(i)).getPath());
                
                else
                {
                    wypiszSciezki((File)modelListy.get(i));
                    
                    for (int j = 0; j <listaSciezek.size(); j++)
                    zipuj(zOutS, (File)listaSciezek.get(j), tmpData, ((File)modelListy.get(i)).getPath());
                    
                    listaSciezek.removeAll(listaSciezek);
                }
            }
            
        zOutS.close();
        }
        
        catch(IOException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        private void zipuj(ZipOutputStream zOutS, File sciezkaPliku, byte[] tmpData, String sciezkaBazowa) throws IOException
        {
            BufferedInputStream inS = new BufferedInputStream(new FileInputStream(sciezkaPliku), BUFFOR);
        
            zOutS.putNextEntry(new ZipEntry(sciezkaPliku.getPath().substring(sciezkaBazowa.lastIndexOf(File.separator)+1)));
        
            int counter;
            while ((counter = inS.read(tmpData, 0, BUFFOR)) != -1)
            zOutS.write(tmpData, 0, counter);
        
            zOutS.closeEntry();
            
            inS.close();
        }
        public static final int BUFFOR = 1024;
        
        
        private void wypiszSciezki(File nazwaSciezki)                 //przyjmuje nazwę scieżki od której ma zacząć
        {
        String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
       
            for (int i = 0; i<nazwyPlikowIKatalogow.length; i++)
            {
        
            File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
        
            if (p.isFile())
                listaSciezek.add(p);
            if (p.isDirectory())
                   
                wypiszSciezki(new File(p.getPath()));
            
        
            
            }
            }
        ArrayList listaSciezek = new ArrayList();
        
    }
    
}
