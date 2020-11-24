package assignment3;

public class CreatorOfDogs {
    private final DogShelter SHELTER = new DogShelter(null);

    public static final Dog REX = new Dog("Rex", 8, 100, 5, 50.0);
    public static final Dog STELLA = new Dog("Stella", 5, 50, 2, 250.0);
    public static final Dog LESSIE = new Dog("Lessie", 3, 70, 9, 25.0);
    public static final Dog POLDO = new Dog("Poldo", 10, 60, 1, 35.0);
    public static final Dog BELLA = new Dog("Bella", 1, 55, 15, 120.0);
    public static final Dog CLOUD = new Dog("Cloud", 4, 10, 23, 80.0);
    public static final Dog ARCHIE = new Dog("Archie", 6, 120, 18, 40.0);
    public static final Dog DAISY = new Dog("Daisy", 7, 15, 12, 35.0);

    DogShelter.DogNode rexNode = SHELTER.new DogNode(REX);
    DogShelter.DogNode stellaNode = SHELTER.new DogNode(STELLA);
    DogShelter.DogNode lessieNode = SHELTER.new DogNode(LESSIE);
    DogShelter.DogNode poldoNode = SHELTER.new DogNode(POLDO);
    DogShelter.DogNode bellaNode = SHELTER.new DogNode(BELLA);
    DogShelter.DogNode cloudNode = SHELTER.new DogNode(CLOUD);
    DogShelter.DogNode archieNode = SHELTER.new DogNode(ARCHIE);
    DogShelter.DogNode daisyNode = SHELTER.new DogNode(DAISY);

    public DogShelter createExampleTree() {
        DogShelter shelter = new DogShelter(null);

        // Add Archie
        shelter.root = archieNode;

        // Add Lessie
        archieNode.younger = lessieNode;
        lessieNode.parent = archieNode;

        // Add Bella
        lessieNode.younger = bellaNode;
        bellaNode.parent = lessieNode;

        // Add Stella
        lessieNode.older = stellaNode;
        stellaNode.parent = lessieNode;

        // Add Cloud
        stellaNode.younger = cloudNode;
        cloudNode.parent = stellaNode;

        // Add Rex
        archieNode.older = rexNode;
        rexNode.parent = archieNode;

        // Add Daisy
        rexNode.younger = daisyNode;
        daisyNode.parent = rexNode;

        // Add Poldo
        rexNode.older = poldoNode;
        poldoNode.parent = rexNode;

        return shelter;
    }
}
