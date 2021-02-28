import java.awt.EventQueue
import javax.swing.JFrame

class Snake : JFrame() {

    init {

        initUI()
    }

    private fun initUI() {

        add(Board())

        title = "Snake"

        isResizable = false
        pack()

        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
    }


}
fun main() {

    EventQueue.invokeLater {
        val ex = Snake()
        ex.isVisible = true
    }
}