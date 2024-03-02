package homework;


import lombok.*;

public class Main
{
    public static void main(String[] args)
    {
        Human h = new Human("Danya", "Volkov");
        System.out.println(h.getFirstName() + " " + h.getLastName());
    }
}

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Human {
    String firstName;
    String lastName;
}