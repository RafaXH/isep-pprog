public class Tempo {

    /*private static final int HORAS_DEFAULT = 8;
    private static final int MINUTOS_DEFAULT = 10;
    private static final int SEGUNDOS_DEFAULT = 30;*/
    private static final int HORAS_MAX = 24;
    private static final int MINUTOS_MAX = 60;
    private static final int SEGUNDOS_MAX = 60;
    //private String formato;
    private static final int HORAS_MIN = 0;
    private static final int MINUTOS_MIN = 0;
    private static final int SEGUNDOS_MIN = 0;
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(String textoHora) {
        String[] numerosHora = new String[3];

        numerosHora = textoHora.split(":");

        this.hora = Math.max(Math.min(Integer.parseInt(numerosHora[0]), HORAS_MAX - 1), HORAS_MIN);
        this.minuto = Math.max(Math.min(Integer.parseInt(numerosHora[1]), MINUTOS_MAX - 1), MINUTOS_MIN);
        this.segundo = Math.max(Math.min(Integer.parseInt(numerosHora[2]), SEGUNDOS_MAX - 1), SEGUNDOS_MIN);
    }

    public Tempo() {
        this(HORAS_MIN + ":" + MINUTOS_MIN + ":" + SEGUNDOS_MIN);
    }

    public static Tempo difTempo(Tempo tempo1, Tempo tempo2) {
        int difHoras, difMinutos, difSegundos, carrySegundos, carryMinutos;

        if (tempo1.getSegundo() < tempo2.getSegundo()) {
            difSegundos = SEGUNDOS_MAX + tempo1.getSegundo() - tempo2.getSegundo();
            carrySegundos = 1;
        } else {
            difSegundos = tempo1.getSegundo() - tempo2.getSegundo();
            carrySegundos = 0;
        }

        if (tempo1.getMinuto() < tempo2.getMinuto()) {
            difMinutos = MINUTOS_MAX + tempo1.getMinuto() - tempo2.getMinuto() - carrySegundos;
            carryMinutos = 1;
        } else {
            difMinutos = tempo1.getMinuto() - tempo2.getMinuto() - carrySegundos;
            carryMinutos = 0;
        }

        if (tempo1.getHora() < tempo2.getHora()) {
            difHoras = HORAS_MAX + tempo1.getHora() - tempo2.getHora() - carryMinutos;
        } else {
            difHoras = tempo1.getHora() - tempo2.getHora() - carryMinutos;
        }

        return new Tempo(difHoras + ":" + difMinutos + ":" + difSegundos);
    }

    public static int difTempoSegundos(Tempo tempo1, Tempo tempo2) {
        return Tempo.difTempo(tempo1, tempo2).getHora() * 3600 + Tempo.difTempo(tempo1, tempo2).getMinuto() * 60 + Tempo.difTempo(tempo1, tempo2).getSegundo();
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String toSentence(int formato) {
        String strHora, strMinuto, strSegundo;

        if (formato == 2) {
            if (this.getHora() % 12 == 0) {
                strHora = "12";
            } else {
                if (this.getHora() % 12 < 10) {
                    strHora = "0" + (int) Math.abs(this.getHora() % 12);
                } else {
                    strHora = "" + (int) Math.abs(this.getHora() % 12);
                }
            }
        } else {
            if (this.getHora() < 10) {
                strHora = "0" + this.getHora();
            } else {
                strHora = "" + this.getHora();
            }
        }

        if (this.getMinuto() < 10) {
            strMinuto = "0" + this.getMinuto();
        } else {
            strMinuto = "" + this.getMinuto();
        }

        if (this.getSegundo() < 10) {
            strSegundo = "0" + this.getSegundo();
        } else {
            strSegundo = "" + this.getSegundo();
        }

        if (formato == 1) {
            return strHora + ":" + strMinuto + ":" + strSegundo;
        } else {
            if (this.hora >= 12) {
                return strHora + ":" + strMinuto + ":" + strSegundo + " PM";
            } else {
                return strHora + ":" + strMinuto + ":" + strSegundo + " AM";
            }
        }
    }

    public void addSegundo() {
        if (this.segundo+1 == SEGUNDOS_MAX) {
            if (this.minuto+1 == MINUTOS_MAX) {
                if (this.hora+1 == HORAS_MAX) {
                    this.hora = HORAS_MIN;
                    this.minuto = MINUTOS_MIN;
                    this.segundo = SEGUNDOS_MIN;

                } else {
                    this.hora = this.hora + 1;
                    this.minuto = MINUTOS_MIN;
                    this.segundo = SEGUNDOS_MIN;
                }
            } else {
                this.minuto = this.minuto + 1;
                this.segundo = SEGUNDOS_MIN;
            }
        } else {
            this.segundo = this.segundo + 1;
        }
    }

    public boolean isMaior(Tempo outroTempo) {
        if ((this.getHora() > outroTempo.getHora()) ||
                (this.getHora() == outroTempo.getHora() && this.getMinuto() > outroTempo.getMinuto()) ||
                (this.getHora() == outroTempo.getHora() && this.getMinuto() == outroTempo.getMinuto() && this.getSegundo() > outroTempo.getSegundo())) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public boolean isMaior(String novoTempo) {
        Tempo nt = new Tempo(novoTempo);

        return this.isMaior(nt);
    }

    @Override
    public String toString() {
        return "Tempo{" +
                "hora=" + this.hora +
                ", minuto=" + this.minuto +
                ", segundo=" + this.segundo +
                '}';
    }
}
