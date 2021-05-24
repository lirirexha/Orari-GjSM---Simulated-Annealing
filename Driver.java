import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Driver extends JFrame {
    private Data data;
    int scheduleNumb = 0;

    public static double acceptanceProbability(int currentConflict, int newConflict, double temp) {
        if (currentConflict <= newConflict) {
            return 1.0;
        } else {
            return Math.exp((currentConflict - newConflict) / temp);
        }
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.data = new Data();
        int iteration = 0;
        System.out.println("Iteration: " + iteration);
        System.out.println("Classes  |  Conflicts");
        System.out.print("----------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        Solutions currentSolution = new Solutions(8, driver.data).sortByFitness();
        System.out.println(currentSolution.getSchedules().get(0));
        int currentConflict = currentSolution.getSchedules().get(0).getNumbOfConflicts();
        System.out.println(currentConflict);

        // SIMULATED ANNEALING

        double temp = 1000;
        double coolingRate = 0.003;
        int newConflict = 0;

        while (temp > 1) {

            iteration = iteration + 1;

            Solutions newSolution = new Solutions(8, driver.data).sortByFitness();
            newConflict = newSolution.getSchedules().get(0).getNumbOfConflicts();

            if (acceptanceProbability(currentConflict, newConflict, temp) > 1) {
                currentConflict = newSolution.getSchedules().get(0).getNumbOfConflicts();
                currentSolution = newSolution;
            }
            temp *= 1 - coolingRate;

            if (newConflict == 0) {
                break;
            }
        }
        System.out.println("Iteration: " + iteration);
        System.out.println(currentSolution.getSchedules().get(0));
        System.out.println(currentConflict);

        JFrame frame = new JFrame("Orari");

        JTable table = new JTable(40, 10);
        table.setBounds(30, 40, 1500, 300);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        ;

        table.getColumnModel().getColumn(0).setHeaderValue("Nr");
        for (int i = 0; i < 40; i++) {
            String a = "" + (i + 1);
            table.setValueAt(a, i, 0);
        }
        String professor = "Professor";
        table.getColumnModel().getColumn(1).setHeaderValue(professor);
        table.getColumnModel().getColumn(1).setWidth(30);
        for (int i = 0; i < 40; i++) {
            String b = driver.data.getInstructors().get(i).getName();
            table.setValueAt(b, i, 1);
        }
        table.getColumnModel().getColumn(2).setHeaderValue("Course");
        
        for (int i = 0; i < 40; i++) {
            String c = driver.data.getCourses().get(i).getName();
            table.setValueAt(c, i, 2);
        }
        table.getColumnModel().getColumn(2).setPreferredWidth(50); 

        table.setValueAt("MONDAY", 0, 5);
        table.setValueAt("TUESDAY", 0, 6);
        table.setValueAt("WEDNESDAY", 0, 7);
        table.setValueAt("THURSDAY", 0, 8);
        table.setValueAt("FRIDAY", 0, 9);

        table.setValueAt("X/1", 1, 4);
        table.setValueAt("X/2", 2, 4);
        table.setValueAt("XI/1", 3, 4);
        table.setValueAt("XI/2", 4, 4);
        table.setValueAt("XII/1", 5, 4);
        table.setValueAt("XII/2", 6, 4);

        String x1Monday = "";
        for (int i = 0; i < 7; i++) {x1Monday = x1Monday + currentSolution.getSchedules().get(0).getClasses().get(i).getCourse().getNumber() + ", ";}
        table.setValueAt(x1Monday, 1, 5);
        String x1Tuesday = "";
        for (int i = 0; i < 7; i++) {x1Tuesday = x1Tuesday + currentSolution.getSchedules().get(0).getClasses().get(i+7).getCourse().getNumber() + ", ";}
        table.setValueAt(x1Tuesday, 1, 6);
        String x1Wednesday = "";
        for (int i = 0; i < 6; i++) {x1Wednesday = x1Wednesday + currentSolution.getSchedules().get(0).getClasses().get(i+14).getCourse().getNumber() + ", ";}
        table.setValueAt(x1Wednesday, 1, 7);
        String x1Thursday = "";
        for (int i = 0; i < 6; i++) {x1Thursday = x1Thursday + currentSolution.getSchedules().get(0).getClasses().get(i+20).getCourse().getNumber() + ", ";}
        table.setValueAt(x1Thursday, 1, 8);
        String x1Friday = "";
        for (int i = 0; i < 6; i++) {x1Friday = x1Friday + currentSolution.getSchedules().get(0).getClasses().get(i+26).getCourse().getNumber() + ", ";}
        table.setValueAt(x1Friday, 1, 9);
        String x2Monday = "";
        for (int i = 0; i < 7; i++) {x2Monday = x2Monday + currentSolution.getSchedules().get(0).getClasses().get(i+32).getCourse().getNumber() + ", ";}
        table.setValueAt(x2Monday, 2, 5);
        String x2Tuesday = "";
        for (int i = 0; i < 7; i++) {x2Tuesday = x2Tuesday + currentSolution.getSchedules().get(0).getClasses().get(i+39).getCourse().getNumber() + ", ";}
        table.setValueAt(x2Tuesday, 2, 6);
        String x2Wednesday = "";
        for (int i = 0; i < 6; i++) {x2Wednesday = x2Wednesday + currentSolution.getSchedules().get(0).getClasses().get(i+46).getCourse().getNumber() + ", ";}
        table.setValueAt(x2Wednesday, 2, 7);
        String x2Thursday = "";
        for (int i = 0; i < 6; i++) {x2Thursday += currentSolution.getSchedules().get(0).getClasses().get(i+52).getCourse().getNumber() + ", ";}
        table.setValueAt(x2Thursday, 2, 8);
        String x2Friday = "";
        for (int i = 0; i < 6; i++) {x2Friday += currentSolution.getSchedules().get(0).getClasses().get(i+58).getCourse().getNumber() + ", ";}
        table.setValueAt(x2Friday, 2, 9);
        String xi1Monday = "";
        for (int i = 0; i < 7; i++) {xi1Monday += currentSolution.getSchedules().get(0).getClasses().get(i+64).getCourse().getNumber() + ", ";}
        table.setValueAt(xi1Monday, 3, 5);
        String xi1Tuesday = "";
        for (int i = 0; i < 7; i++) {xi1Tuesday += currentSolution.getSchedules().get(0).getClasses().get(i+71).getCourse().getNumber() + ", ";}
        table.setValueAt(xi1Tuesday, 3, 6);
        String xi1Wednesday = "";
        for (int i = 0; i < 6; i++) {xi1Wednesday += currentSolution.getSchedules().get(0).getClasses().get(i+78).getCourse().getNumber() + ", ";}
        table.setValueAt(xi1Wednesday, 3, 7);
        String xi1Thursday = "";
        for (int i = 0; i < 6; i++) {xi1Thursday += currentSolution.getSchedules().get(0).getClasses().get(i+84).getCourse().getNumber() + ", ";}
        table.setValueAt(xi1Thursday, 3, 8);
        String xi1Friday = "";
        for (int i = 0; i < 6; i++) {xi1Friday += currentSolution.getSchedules().get(0).getClasses().get(i+90).getCourse().getNumber() + ", ";}
        table.setValueAt(xi1Friday, 3, 9);
        String xi2Monday = "";
        for (int i = 0; i < 7; i++) {xi2Monday += currentSolution.getSchedules().get(0).getClasses().get(i+96).getCourse().getNumber() + ", ";}
        table.setValueAt(xi2Monday, 4, 5);
        String xi2Tuesday = "";
        for (int i = 0; i < 7; i++) {xi2Tuesday += currentSolution.getSchedules().get(0).getClasses().get(i+103).getCourse().getNumber() + ", ";}
        table.setValueAt(xi2Tuesday, 4, 6);
        String xi2Wednesday = "";
        for (int i = 0; i < 6; i++) {xi2Wednesday += currentSolution.getSchedules().get(0).getClasses().get(i+110).getCourse().getNumber() + ", ";}
        table.setValueAt(xi2Wednesday, 4, 7);
        String xi2Thursday = "";
        for (int i = 0; i < 6; i++) {xi2Thursday += currentSolution.getSchedules().get(0).getClasses().get(i+116).getCourse().getNumber() + ", ";}
        table.setValueAt(xi2Thursday, 4, 8);
        String xi2Friday = "";
        for (int i = 0; i < 6; i++) {xi2Friday += currentSolution.getSchedules().get(0).getClasses().get(i+122).getCourse().getNumber() + ", ";}
        table.setValueAt(xi2Friday, 4, 9);
        String xii1Monday = "";
        for (int i = 0; i < 7; i++) {xii1Monday += currentSolution.getSchedules().get(0).getClasses().get(i+128).getCourse().getNumber() + ", ";}
        table.setValueAt(xii1Monday, 5, 5);
        String xii1Tuesday = "";
        for (int i = 0; i < 7; i++) {xii1Tuesday += currentSolution.getSchedules().get(0).getClasses().get(i+135).getCourse().getNumber() + ", ";}
        table.setValueAt(xii1Tuesday, 5, 6);
        String xii1Wednesday = "";
        for (int i = 0; i < 6; i++) {xii1Wednesday += currentSolution.getSchedules().get(0).getClasses().get(i+142).getCourse().getNumber() + ", ";}
        table.setValueAt(xii1Wednesday, 5, 7);
        String xii1Thursday = "";
        for (int i = 0; i < 6; i++) {xii1Thursday += currentSolution.getSchedules().get(0).getClasses().get(i+148).getCourse().getNumber() + ", ";}
        table.setValueAt(xii1Thursday, 5, 8);
        String xii1Friday = "";
        for (int i = 0; i < 6; i++) {xii1Friday += currentSolution.getSchedules().get(0).getClasses().get(i+154).getCourse().getNumber() + ", ";}
        table.setValueAt(xii1Friday, 5, 9);
        String xii2Monday = "";
        for (int i = 0; i < 7; i++) {xii2Monday += currentSolution.getSchedules().get(0).getClasses().get(i+160).getCourse().getNumber() + ", ";}
        table.setValueAt(xii2Monday, 6, 5);
        String xii2Tuesday = "";
        for (int i = 0; i < 7; i++) {xii2Tuesday += currentSolution.getSchedules().get(0).getClasses().get(i+167).getCourse().getNumber() + ", ";}
        table.setValueAt(xii2Tuesday, 6, 6);
        String xii2Wednesday = "";
        for (int i = 0; i < 6; i++) {xii2Wednesday += currentSolution.getSchedules().get(0).getClasses().get(i+174).getCourse().getNumber() + ", ";}
        table.setValueAt(xii2Wednesday, 6, 7);
        String xii2Thursday = "";
        for (int i = 0; i < 6; i++) {xii2Thursday += currentSolution.getSchedules().get(0).getClasses().get(i+180).getCourse().getNumber() + ", ";}
        table.setValueAt(xii2Thursday, 6, 8);
        String xii2Friday = "";
        for (int i = 0; i < 6; i++) {xii2Friday += currentSolution.getSchedules().get(0).getClasses().get(i+186).getCourse().getNumber() + ", ";}
        table.setValueAt(xii2Friday, 6, 9);


        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setSize(1500, 700);
        frame.setResizable(false);
        frame.setVisible(true);

    }

}
