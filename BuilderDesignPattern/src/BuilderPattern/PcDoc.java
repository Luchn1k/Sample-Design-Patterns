/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Luchn1k
 */
public class PcDoc {

    private String brand;
    private String model;
    private String processor;
    private String ram;
    private String gpu;
    private String ssd;
    private String caseImage;

    public PcDoc(Builder build) {
        this.brand = build.brand;
        this.model = build.model;
        this.processor = build.processor;
        this.ram = build.ram;
        this.gpu = build.gpu;
        this.ssd = build.ssd;
        this.caseImage = build.caseImage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getCaseImage() {
        return caseImage;
    }

    public void setCaseImage(String caseImage) {
        this.caseImage = caseImage;
    }

    public static class Builder {

        private String brand;
        private String model;
        private String processor;
        private String ram;
        private String gpu;
        private String ssd;
        private String caseImage;

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model; 
        }

        
        public PcDoc build() {
            return new PcDoc(this);         
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public Builder setCaseImage(String caseImage) {
            this.caseImage = caseImage;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Brand: "+(getBrand())+"\n"+
               "Model: "+(getModel())+"\n"+
               "Processor: "+(getProcessor()==null ? "N/A":getProcessor())+"\n"+
               "RAM: "+(getRam()==null ? "N/A":getRam())+"\n"+
               "GPU: "+(getGpu()==null ? "N/A":getGpu())+"\n"+
               "SSD: "+(getSsd()==null ? "N/A":getSsd())+"\n";
                
    }
    
    
    

}
