package com.company.patterns.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject { //Proxy объект для ленивой загрузки

    private ExpensiveObject realObject;

    @Override
    public void processData() {
        if (realObject == null) {
            realObject = new RealExpensiveObject(); // Ленивая инициализация
        }
        //можно добавить дополнительную логику до вызова
        realObject.processData();
        //или после вызова
    }
}
