
package ec.edu.espe.greenhouseSystem.model;
 class TreeOfMango {
    
private int age;
private String FruitType;
private int Size;
private int MadurationTime;
private String TypeOfweather;

    public TreeOfMango(int age, String FruitType, int Size, int MadurationTime, String TypeOfweather) {
        this.age = age;
        this.FruitType = FruitType;
        this.Size = Size;
        this.MadurationTime = MadurationTime;
        this.TypeOfweather = TypeOfweather;
    }



    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the FruitType
     */
    public String getFruitType() {
        return FruitType;
    }

    /**
     * @param FruitType the FruitType to set
     */
    public void setFruitType(String FruitType) {
        this.FruitType = FruitType;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
    }

    /**
     * @return the MadurationTime
     */
    public int getMadurationTime() {
        return MadurationTime;
    }

    /**
     * @param MadurationTime the MadurationTime to set
     */
    public void setMadurationTime(int MadurationTime) {
        this.MadurationTime = MadurationTime;
    }

    /**
     * @return the TypeOfweather
     */
    public String getTypeOfweather() {
        return TypeOfweather;
    }

    /**
     * @param TypeOfweather the TypeOfweather to set
     */
    public void setTypeOfweather(String TypeOfweather) {
        this.TypeOfweather = TypeOfweather;
    }


}
