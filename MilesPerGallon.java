import java.text.DecimalFormat;

/**
 * Class to calculate Miles Per Gallon for user
 */

public class MilesPerGallon
{
    // User's miles driven since last fill-up
    private double milesDriven;

    // User's litres for their fill-up
    private double litresUsed;

    public MilesPerGallon(double milesDriven, double litresUsed)
    {
        this.milesDriven = milesDriven;
        this.litresUsed = litresUsed;
    }

    public MilesPerGallon(String milesDriven, String litresUsed)
    {
        this.milesDriven = Double.parseDouble(milesDriven);
        this.litresUsed = Double.parseDouble(litresUsed);
    }

    public String getEconomy()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(this.milesDriven / this.litresUsed * 4.5460902819948);
    }

    public static void main (String[] args)
    {
        MilesPerGallon milesPerGallon = new MilesPerGallon(args[0], args[1]);
        System.out.println(milesPerGallon.getEconomy());
    }
}