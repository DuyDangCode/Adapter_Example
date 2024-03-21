public class GuessTheNumberFactory extends GameFactory{
    @Override
    public IGame createGame() {
        return new GuessTheNumberAdapter(5, new GuessTheNumber());
    }
}
