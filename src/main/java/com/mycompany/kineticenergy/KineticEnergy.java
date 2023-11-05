/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kineticenergy;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */
public class KineticEnergy {

    public static void main(String[] args) 
    {
        // variables
        double objectMass;  // Mass of the object that the user input
        double objectVelocity;  // Velocity of the object that the user input
        double objectKineticEnergy;          // Kinetic Energy based on the user's inputs for Mass and Velocity

        // define keyboard object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user to enter a value for mass and read the user's response
        System.out.println("What is the mass of the moving object, in kilograms?");
        objectMass = keyboard.nextDouble();
        
        // ask user to enter a value for velocity and read the user's response
        System.out.println("What is the velocity of the moving object, in meters per second?");
        objectVelocity = keyboard.nextDouble();
        
        /* call the kineticEnergy method for the object mass and object 
        velocity that the user input and print the value of Kinetic energy, 
        measured in Joules (kgm^2 / s^2)
        */
        objectKineticEnergy = kineticEnergy(objectMass, objectVelocity);
        System.out.printf("The Kinetic Energy of Orlando Marin's object is %,.2f Joules!\n", objectKineticEnergy);
    }
    
    /* create kineticEnergy method that accepts an object's mass in kilograms
    and velocity in meters per second as arguments. Method should return the
    amount of kinetic energy that the object has
    */
    public static double kineticEnergy(double mass, double velocity)
    {
        return ((mass * velocity * velocity) / 2);
    }
}
