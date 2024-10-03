package ru.netology;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder; // Импортируем класс HttpClientBuilder
import org.apache.http.client.config.RequestConfig; // Импортируем класс RequestConfig

public class CustomHttpClient {

    // метод для создания и настройки класса CloseableHttpClient
    public static CloseableHttpClient createHttpClient() {

        // создаем и настраиваем CloseableHttpClient с помощью builder
        CloseableHttpClient httpClient = HttpClientBuilder.create() // начинаем создание клиента
                .setDefaultRequestConfig(RequestConfig.custom() // састраиваем RequestConfig
                        .setConnectTimeout(5000)    // максимальное время ожидания подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false)  // возможность следовать редиректу в ответе
                        .build()) // строим конфигурацию RequestConfig
                .build(); // строим CloseableHttpClient

        return httpClient; // возвращаем настроенный httpClient
    }
}