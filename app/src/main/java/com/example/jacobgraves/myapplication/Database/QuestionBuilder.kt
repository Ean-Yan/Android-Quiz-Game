import com.example.jacobgraves.myapplication.Database.Question

class QuestionBuilder {

    public fun build(): MutableList<Question> {

        return mutableListOf<Question>(
            Question(
                "Science",
                1,
                "In what type matter are atoms most tightly packed?",
                "Gases",
                "Liquids",
                "Solids",
                "16x",
                3
            ),
            Question(
                "Science",
                2,
                "On the Richter Scale, how many times stronger is an 8 than a 4?",
                "4x",
                "10000x",
                "1000x",
                "16x",
                2
            ),
            Question(
                "Science",
                3,
                "How far is Earth from the Milky Way Galaxy's center?",
                "350,000 light years",
                "250000 light years",
                "1000 light years",
                "25000 light years",
                4
            ),
            Question(
                "Politics",
                1,
                "What items were renamed in the US House of Representatives’ cafeteria in protest of France’s opposition to the Iraq war in 2003?",
                "French Fries",
                "French Toast",
                "Both",
                "Neither",
                3
            ),
            Question(
                "Politics",
                2,
                "What state did Bill Clinton serve as governor?",
                "Tennessee",
                "Oklahoma",
                "Arkansas",
                "Texas",
                3
            ),
            Question(
                "Politics",
                3,
                "Which US President purchased Alaska from Russia?",
                "Andrew Johnson",
                "Pat Buchanan",
                "Thomas Jefferson",
                "William Mckinley",
                3
            ),
            Question(
                "Sports",
                1,
                "What color jacket is given to the winner of the Masters Tournament?",
                "Green",
                "Brown",
                "Gold",
                "Black",
                1
            ),
            Question(
                "Sports",
                2,
                "Who was the first person inducted into the WWE Hall of Fame?",
                "Hulk Hogan",
                "Vince McMahon",
                "Randy Savage",
                "Andre the Giant",
                4
            ),
            Question(
                "Sports",
                3,
                "Which of these teams has never won a championship?",
                "Indiana Pacers",
                "Milwaukee Bucks",
                "New York Knicks",
                "Houston Rockets",
                1
            ),
            Question(
                "History",
                1,
                "When did the Cold War end?",
                "1989",
                "1985",
                "1977",
                "1992",
                1
            ),
            Question(
                "History",
                2,
                "Who created a code of morals for the Chinese?",
                "Kubai Khan",
                "Qin Shi Huang",
                "Confucius",
                "Sun Yat-sen",
                3
            ),
            Question(
                "History",
                3,
                "What is the name of the three wars fought in Carthage, North Africa to gain control of trade?",
                "Great Wars",
                "Punic Wars",
                "Tetric Wars",
                "Great Wars",
                2
            )
        )
    }
}