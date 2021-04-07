package org.example.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class shake {
    private TranslateTransition tt;



    public shake(Node node){ // node - может быть поле, текст, кнопка и тд

        tt = new TranslateTransition(Duration.millis(70), node); // объявляем тут время и тд

        tt.setFromY(0f);
        tt.setFromX(0f); // отступ от x
        tt.setByX(10f); // на сколько пикселей он передвинется
        tt.setByY(23f); // двигается по вертикали
        tt.setCycleCount(3); // сколько раз будет трясти себя
        tt.setAutoReverse(true); // чтобы он возвращался назад

    }

    public void playAnim (){
        tt.playFromStart(); // таким образом анимация будет проигрываться
    }


}
