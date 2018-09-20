
    public class PairOfDice {
        /**
         * Keep the dice in a single array. This will allow the class to be expanded
         * later on.
         */
        private int[] dice = new int[2];

        /**
         * OH GOSH, A CONSTRUCTOR. And.. WHAT IS THIS? IT ROLLS THE DICE! :O
         */
        public PairOfDice () {
            this.roll();
        }

        /**
         * Roll every single damn die we have.
         *
         * Related: "ROLL ALL THE DICE!" </meme>
         */
        public void roll() {
            // Get the length before the for loop. This will be faster, as we aren't
            // navigating the scope again and again.
            int length = this.dice.length;
            for (int i = 0; i < length; ++i) {
                this.dice[i] = (int) ((Math.random() * 6) + 1);
            }
        }

        /**
         * Single getter function for multiple dice. Enter the index+1 of the die
         * you want. (Index 0 is Die 1, so enter 1). Throws an exception if you call
         * a non-existant die.
         *
         * @param die
         * @return Die Value
         */
        public int getDie(int die) throws Exception {
            die--;
            if (die < 0 || die > this.dice.length)
                throw new Exception("Invalid Die, Die" + die);
            return this.dice[die];
        }
    }
