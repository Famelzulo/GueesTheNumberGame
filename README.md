#Guess The Number Game
Descripción del Proyecto
"Guess The Number" es un juego simple desarrollado en Java, en el que un jugador humano y una computadora se turnan para adivinar un número secreto generado aleatoriamente entre 1 y 100. El juego proporciona retroalimentación después de cada suposición, indicando si el número secreto es mayor o menor que la suposición realizada. El juego termina cuando uno de los jugadores adivina correctamente el número, y se muestra una lista de todas las tentativas del jugador ganador.

Características
Implementado en Java, utilizando IntelliJ IDEA Community Edition.
El número secreto es generado aleatoriamente entre 1 y 100.
El jugador humano y la computadora se turnan para adivinar el número secreto.
Retroalimentación después de cada suposición (mayor, menor, correcto).
Se muestra la lista de todas las tentativas del jugador ganador al finalizar el juego.
Pruebas unitarias utilizando JUnit y Mockito.
Duración del Proyecto
Se estima que este proyecto tomará de 1 a 2 sprints.

Dependencias
JUnit: Para la creación y ejecución de pruebas unitarias.
Mockito: Para la simulación de objetos en las pruebas unitarias.
Instrucciones de Instalación y Ejecución
Clonar el repositorio:

bash
Copiar código
git clone https://github.com/tuusuario/guess-the-number.git
cd guess-the-number
Abrir el proyecto en IntelliJ IDEA:

Abre IntelliJ IDEA.
Selecciona File -> Open... y navega hasta el directorio del proyecto.
Construir el proyecto:

Asegúrate de tener configurado Maven en tu IntelliJ.
Construye el proyecto seleccionando Build -> Build Project o utilizando el atajo Ctrl + F9.
Ejecutar el juego:

Ejecuta la clase GuessTheNumberGame desde IntelliJ seleccionando Run -> Run 'GuessTheNumberGame'.
Ejecutar las pruebas:

Navega hasta src/test/java/game.
Haz clic derecho en el archivo GuessTheNumberGameTest.java y selecciona Run 'GuessTheNumberGameTest'.
Haz lo mismo para HumanPlayerTest.java.
Estructura del Proyecto
src/main/java/game: Contiene el código fuente del juego.
GuessTheNumberGame.java: Clase principal que maneja la lógica del juego.
Player.java: Clase abstracta que define los atributos y métodos compartidos por los jugadores.
HumanPlayer.java: Clase que representa al jugador humano.
ComputerPlayer.java: Clase que representa al jugador computadora.
src/test/java/game: Contiene las pruebas unitarias.
GuessTheNumberGameTest.java: Pruebas unitarias para la clase GuessTheNumberGame.
HumanPlayerTest.java: Pruebas unitarias para la clase HumanPlayer.
Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue o envía un pull request para discutir cualquier cambio que desees realizar.
