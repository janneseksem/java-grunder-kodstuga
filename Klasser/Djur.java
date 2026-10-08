package Klasser;

//Klass för djur där alla har ljud. Ljud är field / instansvariabel
public class Djur {

    //Varje objekt som skapas får sin egen uppsättning
    String ljud;

    //Konstrukor som tar emot ljudet
    Djur(String ljud){
    this.ljud = ljud;
    }
    
    //metoden som skriver ut ljudet
    void gorLjud(){
        System.out.println(ljud);
    }

}



