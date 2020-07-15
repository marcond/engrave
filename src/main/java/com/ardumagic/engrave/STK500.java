/* Licensed under the Apache License, version 2.0. See disclaimer at end of file.

   This class implements the STK500 protocol, which is used by a lot of Arduino
   boards and compatibles like Uno, Mega, Penguino and others.

   There are two main bootloaders implementing this protocol:
      1. The "official" bootloader from Arduino platform:
         https://github.com/arduino/ArduinoCore-avr/tree/master/bootloaders/stk500v2
      2. The Optiboot, which incorporate many features while being smaller:
         https://github.com/Optiboot/optiboot

   Microchip documents this protocol on Application Note 2591 available at:
      https://www.microchip.com//wwwAppNotes/AppNotes.aspx?appnote=en591659
*/
package com.ardumagic.engrave;

public class STK500 implements Programmer
{
    private final static String PROTOCOL_NAME = "STK500";

    @Override
    public String getProtocol ()
    {
        return (PROTOCOL_NAME.toLowerCase ());
    }

    static
    {
        System.out.println ("*** Running ***");
        Registry.register (Programmer.class);
    }
}

/*
   Copyright 2020 Marcond Marchi (ardumagic.com)

   Licensed under the Apache License, Version 2.0 (the "License"); you may not
   use this file except in compliance with the License. You may obtain a copy of
   the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
   License for the specific language governing permissions and limitations under
   the License.
*/