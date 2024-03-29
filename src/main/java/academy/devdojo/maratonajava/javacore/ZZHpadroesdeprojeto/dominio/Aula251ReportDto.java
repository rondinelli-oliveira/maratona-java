package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class Aula251ReportDto {
    private String aircraftName;
    private Aula247Country country;
    private Aula247Currency currency;
    private String personName;


    public static final class Aula251ReportDtoBuilder {
        private String aircraftName;
        private Aula247Country country;
        private Aula247Currency currency;
        private String personName;

        private Aula251ReportDtoBuilder() {
        }

        public static Aula251ReportDtoBuilder builder() {
            return new Aula251ReportDtoBuilder();
        }

        public Aula251ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public Aula251ReportDtoBuilder country(Aula247Country country) {
            this.country = country;
            return this;
        }

        public Aula251ReportDtoBuilder currency(Aula247Currency currency) {
            this.currency = currency;
            return this;
        }

        public Aula251ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public Aula251ReportDto build() {
            Aula251ReportDto aula251ReportDto = new Aula251ReportDto();
            aula251ReportDto.aircraftName = this.aircraftName;
            aula251ReportDto.personName = this.personName;
            aula251ReportDto.country = this.country;
            aula251ReportDto.currency = this.currency;
            return aula251ReportDto;
        }
    }

    @Override
    public String toString() {
        return "Aula251ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }
}
