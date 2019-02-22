package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//From here on out, I'm asking myself two questions:
//1) Do I understand it?
//2) Can I make it from scratch?

//I'm following along with making code that Tim is creating, but that's all useless if I can't make it from scratch.
//If I also  rush, I'll miss out on whether I understand something.
//I'm beginning a new process of just watching the entire video first and take notes of things that I don't uunderstand.
//Yes, for now, I'm going to have to copy code, but that's only because I'm a stage where I'm just simply
//trying to understand the concepts that are behind the code.
//Eventually, I'm going to have to build something from scratch to show that I can do more than just understand.
//Preferably, I want to make a program that uses most of these concepts
//Now, this way of leaning is what I should have done weeks ago, but I was afraid of time.
//But then again, it's useless to do things quickly and have a shoddy understanding of things, which will inevitably
//make it impossible for me to build anything from scratch.
//Now of course, there's just so much repetition of certain things that I am forced to memorize it
//But, that repetition will always be there. I need to be skilled enough to code on the run, at will.
public class Main {
	   //this is the first time that I'm seeing private static in the main class
        //It mak
	    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	    //remember that HashMaps make key, value pairs
        //Now, what is hashing? Hashing is a technique to reconstruct data to take up less space.
        //For more specifics, you'll have to study more on hashing.
	    private static Set<HeavenlyBody> planets = new HashSet<>();

        public static void main(String[] args) {
            //Here, temp, is the name of the HeavenlyBody Object
            //Again, this is a constructor
            HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
            solarSystem.put(temp.getName(), temp); // This is a HashMap
            //We are creating a key, value pair. The planet net is the key.
            //The value part is actually a HashMap. (So, we have a HashMap within a HashMap)
            //Another way to think about it: <Planet, HashMap>
            planets.add(temp);                     // This is a HashSet
            //We are adding String planets to the HashSet

            temp = new HeavenlyBody("Venus", 225);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new HeavenlyBody("Earth", 365);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            //Now, we're dealing with moons, using the same
            //HashMap system that we used for planets
            HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addMoon(tempMoon);

            //We're back to adding a planet with the following code
            temp = new HeavenlyBody("Mars", 687);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);


            //Compare the two. Adding a planet vs. adding a moon.
            //Notice, how we're adding both Mars and Deimos to the same HashMap, solarSystem. Makes sense.
            //What's different is the third line.
            //For planets, we're adding Mars to the Set, planets.
            //For moons, we're using the addMoon method from the HeavenlyBody class.
            //Now, we've already established that temp is a HashMap with a key, value pair.
            //What we're doing here is adding tempMoon to the temp HashMap, which in this case,
            //is Mars.
            //There's a reason why the code for the moons come right after the planets, instead of
            //listing all the planets then all of the moons.
            //temp, hence the name temp, is changing its reference for each new planet.
            //(also remember that sets only contain references, which are equal in memory per element)
            //When we use addMoon, we are entering a HashMap into temp, which at this moment contains Mars.

            //Okay, now I understand what's going on here.
            //But, can I build it from scratch?
            //Tim is using a number of techniques that would be useful for me to remember to apply it to my own programs
            //1) the temp technique. temp, short for temporary, is a dynamic placeholder(variable).
                //I can and will be using this a lot in my own programs.
            //2) the add method. - copied from the HeavenlyBody class as an example:
                //public boolean addMoon(HeavenlyBody moon) {
                //        return this.satellites.add(moon); }
                //I'm finally begnning to have a complete understanding of parameters. I got confused in the beginning
                //because the name of the parameters differed than the variable that we were inserting. For example,
                //the parameter is HeavenlyBody moon, but we're putting in tempMoon.
                //Now that I understand the concept of generics, it doesn't matter that the name differs. Parameters
                //are like specially shapped holes in that kids toy. Square holes can only accept objects with a square face.
                //Running with this analogy, the parameter can only hold objects with data type HeavenlyBody,
                //which tempMoon has. Remember, the constructor, "tempMoon = new HeavenlyBody("name", orbitalPeriod);
                //It's only after studying Java that I understand this because you don't have to declare data types
                //in JavaScript, my first language (which I have a cursory use of at the moment).
            //3) Using .get with maps
                //this comes with the Map interface and is something you need to memorize when building
                //your own programs. It's really simple, but I'm going to note them anyway to help
                //build into my own memory and perhaps to make a complete log of things that I need
                //to memorize when using Java.
            //4) Using .addAll
                //this comes with the Set inferface


            //Now, we're adding the moons of Mars.
            tempMoon = new HeavenlyBody("Deimos", 1.3);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addMoon(tempMoon);

            tempMoon = new HeavenlyBody("Phobos", 0.3);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addMoon(tempMoon);

            //Now, we're adding the planet Jupiter
            temp = new HeavenlyBody("Jupiter", 4332);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            //Now, we're adding the moons of Jupiter
            tempMoon = new HeavenlyBody("Io", 1.8);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addMoon(tempMoon);

            tempMoon = new HeavenlyBody("Europa", 3.5);
            solarSystem.put(tempMoon.getName(), temp);
            temp.addMoon(tempMoon);

            tempMoon = new HeavenlyBody("Ganymede", 7.1);
            solarSystem.put(tempMoon.getName(), temp);
            temp.addMoon(tempMoon);

            tempMoon = new HeavenlyBody("Callisto", 16.7);
            solarSystem.put(tempMoon.getName(), tempMoon);
            temp.addMoon(tempMoon);

            //Now, we're adding the planet of Saturn
            temp = new HeavenlyBody("Saturn", 10759);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp); //I'm starting to notice the planets.add vs. temp.addMoon

            //Now, we're adding the planet of Uranus, Neptune, and then Pluto
            temp = new HeavenlyBody("Uranus", 30660);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new HeavenlyBody("Neptune", 165);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            temp = new HeavenlyBody("Pluto", 248);
            solarSystem.put(temp.getName(), temp);
            planets.add(temp);

            //Now, we're returning to the console our code
            System.out.println("Planets"); // -- simply stating that we're looking at planets now
           //Another for loop here. sout forEach HeavenlyBody planet for the length of planets
            for(HeavenlyBody planet: planets) {
                System.out.println("\t" + planet.getName()); // -- \t is just a tab key
            }

            HeavenlyBody body = solarSystem.get("Mars");
            //.get comes with the Map interface. This is one of those things you have to memorize
            System.out.println("Moons of " + body.getName());
            //We're using the getName method from the HeavenlyBody class to get the name of body,
            //which is in this case Mars
            //Also, remember that in a forEach loop, it doesn't matter what the variable name is, as long as it's used again
            //For example, you could replace marsMoon with anything, and it'll still work.
            //the variable is equivalent to i = 0 and then iteratates, in this case, marsMoon++
            for(HeavenlyBody marsMoon: body.getSatellites()) {
                System.out.println("\t" + marsMoon.getName());
            }

            Set<HeavenlyBody> moons = new HashSet<>(); // 1
            for(HeavenlyBody planet: planets) {        // 2
                moons.addAll(planet.getSatellites());  // 3
                // .addAll comes with the Set interface. Another thing you need to memorize.
                //The result that we want is to add all the moons into the hashSet moon.
                //So, 1) we defined moons as a HashSet.
                //Then, 2-3) Then, we're adding GROUPS of Hashsets from each planet to HashSet Moon
                //In other words, the elements in the moons Hashset is referring to planet Hashsets.
                //In other other words, we're adding all of the moon Hashsets per planet Hashset
                //get Satellites() does the following command:
                // return new HashSet<>(this.satellites);
                //It's, in other words, creating a new HashSet
            }

            System.out.println("All Moons");
            for(HeavenlyBody moon: moons) {
                System.out.println("\t" + moon.getName());
            }

            HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
            planets.add(pluto);

            for(HeavenlyBody planet : planets) {
                System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
            } //get the name of planet forEach item in planets as well as orbital period

            //Object is the base object from which all other objects inherit from
            Object o = new Object();
            o.equals(o); // -- referential equality
            "pluto".equals("");
            // -- string equals method.
            //if string is being compared to itself, it will return true
        }

}


//sets have no defined ordering - aka chaotic
//sets CANNOT contain DUPLICATES

//Sets only contain REFERENCES

//Set interface has the basic add, remove, and clear
//Something I've noticed about reading up on Set documentation and the like is that I'm coming across
//the concept of time complexity over and over again.
//In the Cracking the Coding Interview, time complexity, or Big O(n), is stressed as hugely important
//concept to understand as a developer. I'm going to have to investigate what this is actually letter

//HashSet is slower than HashMap, for example, but I don't know why. I'll have to look into this later.

//Some more basic stuff here
//I never knew what the "==" was officially called.
//It's called a relational operator and tests for equality, whether whatever on the left is equal to the right
//A single "=" is an assignment operator, which assigns a value to a variable

//if two objects compare equal they must have the same hashcode. Not sure what that means yet.