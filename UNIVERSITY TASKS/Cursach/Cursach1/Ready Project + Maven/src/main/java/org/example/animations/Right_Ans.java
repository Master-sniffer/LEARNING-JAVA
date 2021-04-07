package org.example.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Right_Ans {
    private TranslateTransition DA;



    public Right_Ans(Node node){ // node - может быть поле, текст, кнопка и тд

        DA = new TranslateTransition(Duration.millis(70), node); // объявляем тут время и тд

        DA.setFromY(0f);
        DA.setFromX(0f); // отступ от x
        DA.setByX(5f); // на сколько пикселей он передвинется
        DA.setByY(30f);// двигается по вертикали
        DA.setCycleCount(5); // сколько раз будет трясти себя
        DA.setAutoReverse(true); // чтобы он возвращался назад

    }

    public void playAnim (){
        DA.playFromStart(); // таким образом анимация будет проигрываться
    }


}
