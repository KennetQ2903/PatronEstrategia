# Plantilla
![Plantilla](public/strategyTemplate.webp)
# Diagrama de clases
![Diagrama de clases](public/StrategyPattern.png)
# Diagrama de secuencia
```mermaid
sequenceDiagram
    participant Duck
    participant IFly
    participant ISound
    participant ISwim
    participant FlyWithWings
    participant Quack
    participant SwimWithWebbedFeet

    Duck->>IFly: setFlyBehavior()
    IFly->>FlyWithWings: assign Fly behavior

    Duck->>ISound: setSoundBehavior()
    ISound->>Quack: assign Sound behavior

    Duck->>ISwim: setSwimBehavior()
    ISwim->>SwimWithWebbedFeet: assign Swim behavior

    Duck->>FlyWithWings: fly()
    FlyWithWings->>Duck: fly result

    Duck->>Quack: makeSound()
    Quack->>Duck: quack result

    Duck->>SwimWithWebbedFeet: swim()
    SwimWithWebbedFeet->>Duck: swim result
```