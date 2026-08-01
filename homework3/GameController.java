public class GameController {
    Boolean[] buttons  = {true, false, false, false};
    public Boolean is_pressed(int button_num) {
        if (button_num >= 0 && button_num < buttons.length) {
    return buttons[button_num];
}
    return false;

    }
}
