    /**
     * Program "RollEm" by Navarr Barnier Executes several functions defined by Lab
     * 1.
     *
     * These functions are documented in their respective blocks.
     *
     * @author Navarr Barnier
     */
    public class RollEm {

        /**
         * A simple constructor. Does what you'd expect. Creates the dice and then
         * calls all the functions.
         *
         * Added throws Exception since I do everything the long way and there
         * should be no reason for it to call an invalid die. Also, This is a
         * single-serving program, so its okay for that error to hit the console. It
         * would mean that I failed this lab, probs.
         *
         * @param args
         * @throws Exception
         */
        public static void main(String[] args) throws Exception {
            PairOfDice bones = new PairOfDice();

            RollTillDoubles(bones);
            DoublesInAMil(bones);
            AvgSum(bones);
        }

        /**
         * Roll the dice until we find doubles, and then output the amount of rolls
         * it took in order to find them.
         *
         * @param bones
         * @throws Exception
         */
        public static void RollTillDoubles(PairOfDice bones) throws Exception {
            int count = 0;
            do {
                bones.roll();
                ++count;
            } while (!isDoubles(bones));
            System.out.println("It took " + count
                    + " rolls in order to get doubles.  Both dice are now: "
                    + bones.getDie(1));
        }

        /**
         * Roll a million dice and then output how many rolls rendered us doubles.
         *
         * @param bones
         * @throws Exception
         */
        public static void DoublesInAMil(PairOfDice bones) throws Exception {
            int count = 0;
            for (int i = 0; i < 1000000; ++i) {
                bones.roll();
                if (isDoubles(bones))
                    ++count;
            }
            System.out
                    .println("In a million rolls, you got " + count + " doubles.");
        }

        /**
         * Roll one hundred thousand dice and output the average of the sumation of
         * each roll.
         *
         * @param bones
         * @throws Exception
         */
        public static void AvgSum(PairOfDice bones) throws Exception {
            int rolls = 100000;
            int sum = 0;
            for (int i = 0; i < rolls; ++i) {
                bones.roll();
                sum = sum + (bones.getDie(1) + bones.getDie(2));
            }
            double avg = sum / rolls;
            System.out.println("Your average dice roll in " + rolls
                    + " rolls was: " + avg);
        }

        /**
         * Simple helper method so that I didn't have to keep writing the if
         * statement over and over and over and over again. You'll thank me later.
         *
         * @param bones
         * @return
         * @throws Exception
         */
        public static boolean isDoubles(PairOfDice bones) throws Exception {
            return (bones.getDie(1) == bones.getDie(2));
        }

    }
