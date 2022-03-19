public abstract class Taxpayer{
private String id;
public String getId(){
return id;
}
public abstract double pay();
}

public class Company extends Taxpayer
{
public double pay(){
return 1000;
}
}

public class Company extends Taxpayer
{
public double pay(){
return 1000;
}
}

public class FreeLand extends Taxpayer
{
public double pay(){
return 10;
}
}

public class Employee extends Taxpayer
{
public double pay(){
return 100;
}
}

public class TaxManager {
private static final int MAX = 100;
private Taxpayer[] list = new Taxpayer[MAX];
private int count = 0;
public boolean addTaxpayer(Taxpayer taxpayer) {
if (count >= MAX) {
return false;
}
list[count++] = taxpayer;
return true;
}
public double getTax() {
double sum = 0;
for (int i = 0; i < count; i++) {
//method pay is polymorphic because we do not
// know exact object is instance of which class
sum += list[i].pay();
}
return sum;
}
}
