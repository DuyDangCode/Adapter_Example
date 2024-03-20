public class RockPaperScissorsFactory extends GameFactory{

    @Override
    public IGame createGame() {
        return new RockPaperScissors();
    }
}
