package org.kurtlike;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.kurtlike.elements.Console;
import org.kurtlike.elements.charts.MyLineChart;
import org.kurtlike.elements.choiceboxes.MyChoiceBox;
import org.kurtlike.elements.interfaces.Manageable;
import org.kurtlike.elements.textfields.AccuracyField;
import org.kurtlike.elements.textfields.IntervalBoundary;

/**
 * @author kurtlike
 */

public class PrimaryController {
    @FXML
    private Button clearButton;
    @FXML
    private AnchorPane leTableauPrincipal;

    @FXML
    private Pane leTableauGrapheDeFonction;

    @FXML
    private Pane leTableauChoix;

    @FXML
    private Button iterButton;

    @FXML
    private ChoiceBox<String> methodeSelection;

    @FXML
    private ChoiceBox<String> lequationChoix;

    @FXML
    private TextField gaucheBordure;

    @FXML
    private TextField droiteBordure;

    @FXML
    private TextField erreur = new TextField();

    @FXML
    private Button resoudreBouton = new Button();

    @FXML
    private TextArea console = new TextArea();

    @FXML
    private MenuBar leMenu;

    @FXML
    public void initialize() {
        Manageable<String,String> manageable = new SolutionContainer();
        MyChoiceBox<String,String> functions = new MyChoiceBox<>(lequationChoix);
        MyChoiceBox<String,String> methods = new MyChoiceBox<>(methodeSelection);

        functions.addAll(manageable.getFunctions());
        methods.addAll(manageable.getMethods());
        MyLineChart myLineChart = new MyLineChart();


        myLineChart.insertChart(leTableauGrapheDeFonction);
        myLineChart.addCss("css/chart.css");
        lequationChoix.setOnAction(event -> {
            manageable.setChosenFunction(functions.getSelectedKey());
            myLineChart.addFunc(manageable.getFuncDots(),manageable.getFuncName());
        });
        resoudreBouton.setOnAction(event -> {
            manageable.setChosenMethod(methods.getSelectedKey());
            manageable.setChosenFunction(functions.getSelectedKey());

            IntervalBoundary left = new IntervalBoundary(gaucheBordure);
            IntervalBoundary right = new IntervalBoundary(droiteBordure);
            AccuracyField acc = new AccuracyField(erreur);

            manageable.setBorders(left.getBorder(),right.getBorder());
            manageable.setAccuracy(acc.getAccuracy());

            myLineChart.addFunc(manageable.getFuncDots(),manageable.getFuncName());
            iterButton.setOnAction(event1 -> {
                if(!manageable.isEnd()) {
                    Number[] dot = manageable.getNextApproximationDot();
                    String dotName = manageable.getApproximationDotsName();
                    myLineChart.addDot(dot[0], dot[1], dotName);
                }
                else {
                    Console.writeAnswer(console,manageable.getAnswer());
                    Console.writeLine(console,manageable.getAnswersNote());
                }
            });

        });
        clearButton.setOnAction(event -> {
            myLineChart.clearChart();
        });
    }

}