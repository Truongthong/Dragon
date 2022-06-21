
class Program
class Thermostat
{
    public delegate void TemperatureChangeHandler(
                float newTemperature);


    // Define the event publisher
    private TemperatureChangeHandler _OnTemperatureChange;
    public TemperatureChangeHandler OnTemperatureChange
    {
        get { return _OnTemperatureChange; }
        set { _OnTemperatureChange = value; }
    }

    public float CurrentTemperature
    {
        get { return _CurrentTemperature; }
        set
        {
            if (value != CurrentTemperature)
            {
                _CurrentTemperature = value;
                // Call subscribers
                if (OnTemperatureChange!=null)
                {
                    OnTemperatureChange(value);    
                }                    
            }
        }
    }
    private float _CurrentTemperature;
}


class Cooler
{
    public Cooler(float temperature)
    {
        Temperature = temperature;
    }
    public float Temperature
    {
        get { return _Temperature; }
        set { _Temperature = value; }
    }
    private float _Temperature;
    public void OnTemperatureChanged(float newTemperature)
    {
        if (newTemperature > Temperature)
        {
            System.Console.WriteLine("Cooler: On");
        }
        else
        {
            System.Console.WriteLine("Cooler: Off");
        }
    }
}

class Heater
{
    public Heater(float temperature)
    {
        Temperature = temperature;
    }
    public float Temperature
    {
        get { return _Temperature; }
        set { _Temperature = value; }
    }
    private float _Temperature;
    public void OnTemperatureChanged(float newTemperature)
    {
        if (newTemperature < Temperature)
        {
            System.Console.WriteLine("Heater: On");
        }
        else
        {
            System.Console.WriteLine("Heater: Off");
        }
    }
}
class Heater
{
    public Heater(float temperature)
    {
        Temperature = temperature;
    }
    public float Temperature
    {
        get { return _Temperature; }
        set { _Temperature = value; }
    }
    private float _Temperature;
    public void OnTemperatureChanged(float newTemperature)
    {
        if (newTemperature < Temperature)
        {
            System.Console.WriteLine("Heater: On");
        }
        else
        {
            System.Console.WriteLine("Heater: Off");
        }
    }
}

{
public void Increment(ref int X);
public static void Add2(ref int x)
{
x += 2;
}
public static void Add3(ref int x)
{
x += 3;
}
public static void Main()
{
Increment functionDelegate = Add2;
functionDelegate += Add3;
functionDelegate += Add2;
int x = 5;
functionDelegate(ref x);
Console.ReadLine();
}
}


class Thermostat
{
    public delegate void TemperatureChangeHandler(
                float newTemperature);


    // Define the event publisher
    private TemperatureChangeHandler _OnTemperatureChange;
    public TemperatureChangeHandler OnTemperatureChange
    {
        get { return _OnTemperatureChange; }
        set { _OnTemperatureChange = value; }
    }

    public float CurrentTemperature
    {
        get { return _CurrentTemperature; }
        set
        {
            if (value != CurrentTemperature)
            {
                _CurrentTemperature = value;
                // Call subscribers
                if (OnTemperatureChange!=null)
                {
                    OnTemperatureChange(value);    
                }                    
            }
        }
    }
    private float _CurrentTemperature;
}
class Program
{
    static void Main(string[] args)
    {
        Thermostat thermostat = new Thermostat();
        Heater heater = new Heater(60);
        thermostat.OnTemperatureChange +=
             heater.OnTemperatureChanged;
        Heater heaterCuong = new Heater(100);
        thermostat.OnTemperatureChange += 
             heaterCuong.OnTemperatureChanged;

        Cooler cooler = new Cooler(80);
        thermostat.OnTemperatureChange += 
             cooler.OnTemperatureChanged;

        string temperature;
        Console.Write("Enter temperature: ");
        temperature = Console.ReadLine();
        thermostat.CurrentTemperature = int.Parse(temperature);
        Console.ReadLine();
    }
}


class Cooler
{
    public Cooler(float temperature)
    {
        Temperature = temperature;
    }
    public float Temperature
    {
        get { return _Temperature; }
        set { _Temperature = value; }
    }
    private float _Temperature;
    public void OnTemperatureChanged(float newTemperature)
    {
        if (newTemperature > Temperature)
        {
            System.Console.WriteLine("Cooler: On");
        }
        else
        {
            System.Console.WriteLine("Cooler: Off");
        }
    }
}

class Heater
{
    public Heater(float temperature)
    {
        Temperature = temperature;
    }
    public float Temperature
    {
        get { return _Temperature; }
        set { _Temperature = value; }
    }
    private float _Temperature;
    public void OnTemperatureChanged(float newTemperature)
    {
        if (newTemperature < Temperature)
        {
            System.Console.WriteLine("Heater: On");
        }
        else
        {
            System.Console.WriteLine("Heater: Off");
        }
    }
}

