Para compilar o programa, entre na pasta raiz do trabalho (TrabalhoFinal/):

find -name "*.java" > sources

javac -d bin @sources

rm sources

Para executar o programa, utilize o comando abaixo:

java -cp bin br.com.trabalhofinal.Main
