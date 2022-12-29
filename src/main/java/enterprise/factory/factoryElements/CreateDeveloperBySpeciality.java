
package enterprise.factory.factoryElements;

public class CreateDeveloperBySpeciality {

    public static DeveloperFactory create(DeveloperSpecialty speciality) {

        if (speciality.equals(DeveloperSpecialty.JAVA)) {

            return new JavaDeveloperFactory();

        } else if (speciality.equals(DeveloperSpecialty.PYTHON)) {

            return new PythonDeveloperFactory();

        } else {

            System.out.println("Such speciality doesnt exists");

            return null;
        }
    }
}
