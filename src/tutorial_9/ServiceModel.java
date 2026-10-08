package tutorial_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main
{
    static class ServiceModel
    {
        int cost;
        public void calculateCost(boolean general, boolean oil, boolean brake, boolean battery)
        {
            cost=0;
            if(general)
                cost=cost+1000;
            if(oil)
                cost=cost+800;
            if(brake)
                cost=cost+1200;
            if(battery)
                cost=cost+500;
        }
        public int getCost()
        {
            return cost;
        }
    }
    static class ServiceView extends JFrame
    {
        JTextField vehicleNo;
        JRadioButton twoWheeler;
        JRadioButton car;
        JCheckBox generalService;
        JCheckBox oilChange;
        JCheckBox brakeService;
        JCheckBox batteryCheck;
        JButton calculate;
        ServiceView()
        {
            setTitle("Vehicle Service Cost Estimator");
            setSize(400,400);
            setLayout(new FlowLayout());
            add(new JLabel("Vehicle Registration Number"));
            vehicleNo=new JTextField(15);
            add(vehicleNo);
            add(new JLabel("Vehicle Type"));
            twoWheeler=new JRadioButton("Two Wheeler");
            car=new JRadioButton("Car");
            ButtonGroup bg=new Buttongroup();
            bg.add(twoWheeler);
            bg.add(car);
            add(twoWheeler);
            add(car);
            add(new JLabel("Select Services"));
            generalService=new JCheckBox("General Service-rs.1000");
            oilChange=new JCheckBox("Oil Change -rs.800");
            brakeService=new JCheckBox("Brake Service-rs.1200");
            batteryCheck=new JCheckBox("Battery Check-rs.500");
            add(generalService);
            add(oilChange);
            add(brakeService);
            add(batteryCheck);
            calculate=new JButton("Calculate Cost");
            add(calculate);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
    static class ServiceController implements ActionListener
    {
        ServiceModel model;
        ServiceView view;
        ServiceController(ServiceModel m, ServiceView v)
        {
            model=m;
            view=v;
            view.calculate.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e)
        {
            model.calculateCost(
                    view.generalService.isselected(),
                    view.oilChange.isselected(),
                    view.brakeService.isselected(),
                    view.batteryCheck.isselected()
            );
            JOptionPane.showMessageDialog(view,"Vehicle number:"+view.vehicleNo.getText()+"\nService Cost:Rs."+model.getCost());
        }
    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                ServiceModel model=new ServiceModel();
                ServiceView view=new ServiceView();
                new ServiceController(model,view);
            }
        });
    }
}
