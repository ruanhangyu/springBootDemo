/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.ehcache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;


@Component
public class MapEhcaChe<K, V> {
	private Map<K, V> ehcaCheMap = new ConcurrentHashMap<K, V>();

	public void put(K k, V value) {
		ehcaCheMap.put(k, value);
	}

	public V get(K k) {
		return ehcaCheMap.get(k);
	}

	public void remove(K k) {
		ehcaCheMap.remove(k);
	}
}
