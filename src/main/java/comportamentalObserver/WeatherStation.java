package comportamentalObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    // adc um observador à lista
    public void subscribe(TemperatureObserver o) {
        observers.add(o);
    }

    // remove um observador da lista
    public void unsubscribe(TemperatureObserver o) {
        observers.remove(o);
    }

    // dispara a notificação, atualizando a temp
    public void setTemperature(double temp) {
        this.temperature = temp;
        notifyObservers();
    }

    // roda a lista
    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.onTemperatureChanged(this.temperature);
        }
    }
}