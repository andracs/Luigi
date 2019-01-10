import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;

public class LuigiGame extends GameApplication {

    @Override
    protected void initSettings(GameSettings gameSettings) {
        gameSettings.setWidth(15 * 70);
        gameSettings.setHeight(10 * 70);
        gameSettings.setTitle("Luigi");
    }

    @Override
    protected void initGame() {
        getGameWorld().setLevelFromMap("mario.json");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
