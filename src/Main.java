import model.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        final String FIL_IN = "src" + File.separator +
                "data" + File.separator + "input.txt";


        final String FILE_OUT = "src" + File.separator +
                "data" + File.separator + "output.txt";


        Person person1 = null;
        try (BufferedReader br = new BufferedReader(new FileReader(FIL_IN))) {

            String fileLine = br.readLine().trim();
            String[] objFields = fileLine.split("");
            person1 = new Person(objFields[0], Integer.parseInt(objFields[1]),
                    Double.parseDouble(objFields[2]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    } catch(FileNotFoundException e)

    {


        e.printStackTrace();
    } catch(IOException e){

    {
        e.printStackTrace();

    }
        System.out.println(person1);

        if (person1.getAge() > 40){
            person1.setSalary(person1.getSalary() * 2 );

        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_OUT))){
            bw.write(person1.toFileLine());
        }catch (IOException e){
            e.printStackTrace();
            }
        }

}
}
