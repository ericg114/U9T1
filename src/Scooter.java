public class Scooter extends Vehicle

{

        private int coilCount;

        public Scooter(String name, int wheels, int gearCount)
        {
            super(name, wheels);
            this.coilCount = gearCount;


        }
        public int coilCount()
        {
            return coilCount;
        }

        public void Bellrung()
        {
            // write some code here to honk, etc.
            System.out.println("Ring Ring! Im scootering here!");
        }
}
