package com.company.other.references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {

    public static void main(String[] args) {

        // Strong References (сильные ссылки)
        Object object1 = new Object(); // Пока есть хотябы одна сильная ссылка на объект, объект не будет собран GC
        System.out.println("1. Strong reference: " + object1);
        object1 = null; //ссылка удаляется или присвоением null или выходом из области видимости

        // Soft References (мягкие ссылки)
        Object object2 = new Object();
        System.out.println("2. Strong reference: " + object2);
        SoftReference<Object> softRef = new SoftReference<>(object2);
        object2 = null; // Теперь объект доступен только через мягкую ссылку
        System.out.println("Soft Reference: " + softRef.get()); // GC не удалит объект из памяти пока не возникнет нехватки памяти

        // Weak References (слабые ссылки)
        Object object3 = new Object();
        System.out.println("3. Strong reference: " + object3);
        WeakReference<Object> weakRef = new WeakReference<>(object3);
        object3 = null;
        System.out.println("Weak Reference: " + weakRef.get()); // GC удалит объект при первом запуске GC

        // Phantom References (фантомные ссылки)
        MyObject myObject = new MyObject();
        System.out.println("4. Strong reference myObject: " + myObject);
        ReferenceQueue<MyObject> queue = new ReferenceQueue<>();
        PhantomReference<MyObject> phantomRef = new PhantomReference<>(myObject, queue);
        myObject = null;
        System.out.println("Phantom Reference: " + phantomRef.get()); // .get() всегда возвращает null для фантомных ссылок
        System.out.println("Reference queue poll: " + queue.poll());

        // Result after starting GC
        System.out.println("----- try to start GC -----");
        System.gc();

        System.out.println("Soft Reference: " + softRef.get());
        System.out.println("Weak Reference: " + weakRef.get());
        System.out.println("Phantom Reference: " + phantomRef.get());
        System.out.println("Reference queue poll: " + queue.poll());
    }
}

class MyObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("--- MyObject finalized");
    }
}
