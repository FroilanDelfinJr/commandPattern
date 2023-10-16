package commandPattern;

import java.util.Scanner;
public class SmartHomeApp {
    public static void main(String[] args){

        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        RemoteControl rc = new RemoteControl();

        while (true){

            Scanner input = new Scanner(System.in);
            System.out.println("[1] Lights");
            System.out.println("[2] Thermostat");
            System.out.println("[3] Music Player");
            System.out.println("[4] Exit");
            System.out.print("\nChoose a device to turn on: ");
            Integer choice = input.nextInt();
            System.out.println();


            switch(choice){
                case 1:
                    rc.setCommand(new PowerOnLights(lights));
                    rc.clickButton();

                    while (true) {
                        System.out.println();
                        System.out.println("\t[1] Increase brightness");
                        System.out.println("\t[2] Decrease brightness");
                        System.out.println("\t[3] Turn off lights");
                        System.out.println("\t[4] Back to main menu");
                        System.out.print("\n\tChoose a command for lights: ");
                        Integer command = input.nextInt();
                        System.out.println();

                        switch(command){
                            case 1:
                                rc.setCommand(new IncreaseBrightness(lights));
                                rc.clickButton();
                                break;

                            case 2:
                                rc.setCommand(new DecreaseBrightness(lights));
                                rc.clickButton();
                                break;

                            case 3:
                                rc.setCommand(new PowerOffLights(lights));
                                rc.clickButton();
                                System.out.println();
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("\tInvalid choice. Please enter a valid option.");
                                System.out.println();
                                break;
                        }

                        if (command == 3 || command == 4) {
                            break;
                        }
                    }
                    break;

                case 2:
                    rc.setCommand(new SwitchOnThermostat(thermostat));
                    rc.clickButton();

                    while (true) {
                        System.out.println();
                        System.out.println("\t[1] Increase temperature");
                        System.out.println("\t[2] Decrease temperature");
                        System.out.println("\t[3] Turn off thermostat");
                        System.out.println("\t[4] Back to main menu");
                        System.out.print("\n\tChoose a command for thermostat: ");
                        Integer command = input.nextInt();
                        System.out.println();

                        switch(command){
                            case 1:
                                rc.setCommand(new IncreaseTemperature(thermostat));
                                rc.clickButton();
                                break;

                            case 2:
                                rc.setCommand(new DecreaseTemperature(thermostat));
                                rc.clickButton();
                                break;

                            case 3:
                                rc.setCommand(new SwitchOffThermostat(thermostat));
                                rc.clickButton();
                                System.out.println();
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("\tInvalid choice. Please enter a valid option.");
                                System.out.println();
                                break;
                        }

                        if (command == 3 || command == 4) {
                            break;
                        }
                    }
                    break;

                case 3:
                    rc.setCommand(new SwitchOnMusicPlayer(musicPlayer));
                    rc.clickButton();

                    while (true) {
                        System.out.println();
                        System.out.println("\t[1] Increase volume");
                        System.out.println("\t[2] Decrease volume");
                        System.out.println("\t[3] Turn off music player");
                        System.out.println("\t[4] Back to main menu");
                        System.out.print("\n\tChoose a command for music player: ");
                        Integer command = input.nextInt();
                        System.out.println();

                        switch(command){
                            case 1:
                                rc.setCommand(new IncreaseVolume(musicPlayer));
                                rc.clickButton();
                                break;

                            case 2:
                                rc.setCommand(new DecreaseVolume(musicPlayer));
                                rc.clickButton();
                                break;

                            case 3:
                                rc.setCommand(new SwitchOffMusicPlayer(musicPlayer));
                                rc.clickButton();
                                System.out.println();
                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("\tInvalid choice. Please enter a valid option.");
                                System.out.println();
                                break;
                        }

                        if (command == 3 || command == 4) {
                            break;
                        }
                    }
                    break;

                case 4: System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                    break;
            }

        }

    }

}
