public class Square extends Shape{
        private double width;
        public Square(){
            width = 0.0;
        }
        public Square(double width){
            this.width = width;
        }
        public double calculateArea(){
            return width * width;
        }
}
