/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
package org.eclipse.kura.usb;

/**
 * Representation of USB network devices
 */
public class UsbNetDevice extends AbstractUsbDevice {

	/** The interface name associated with this device **/
	private String m_interfaceName;

	public UsbNetDevice(String vendorId, String productId, String manufacturerName, String productName, String usbBusNumber, String usbDevicePath, String interfaceName) {
		super(vendorId, productId, manufacturerName, productName, usbBusNumber, usbDevicePath);
		m_interfaceName = interfaceName;
	}

	public String getInterfaceName() {
		return m_interfaceName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((m_interfaceName == null) ? 0 : m_interfaceName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsbNetDevice other = (UsbNetDevice) obj;
		if (m_interfaceName == null) {
			if (other.m_interfaceName != null)
				return false;
		} else if (!m_interfaceName.equals(other.m_interfaceName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsbNetDevice [getInterfaceName()=" + getInterfaceName()
				+ ", getVendorId()=" + getVendorId()
				+ ", getProductId()=" + getProductId()
				+ ", getManufacturerName()=" + getManufacturerName()
				+ ", getProductName()=" + getProductName()
				+ ", getUsbBusNumber()=" + getUsbBusNumber()
				+ ", getUsbDevicePath()=" + getUsbDevicePath()
				+ ", getUsbPort()=" + getUsbPort() + "]";
	}
}
