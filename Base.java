class Base
{
    private double bmIndex;
    private double weight;
    private double height;

    private Base(Child c)
    {
        this.weight = c.weight;
        this.height = c.height;
    }  
    
    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public double getBMI()
    {
        bmIndex = weight / (height * height);
        return bmIndex * 10000.00;
    }

    public static class Child 
    {
        private double bmIndex;
        private double weight;
        private double height;

        Child(double weight, double height)
        {
            this.weight = weight;
            this.height = height;
        }

        public Child weight(double weight)
        {
            this.weight = weight;
            return this;
        }

        public Child height(double height)
        {
            this.height = height;
            return this;
        }

        public Child BMI()
        {
            bmIndex = weight / (height * height);
            return this;
        }

        public Base build()
        {
            Base b = new Base(this);
            return b;
        }
    }
}