/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.maven.internal.matcher;

import org.sonatype.nexus.repository.maven.MavenPathParser;
import org.sonatype.nexus.repository.maven.internal.Constants;

/**
 * Matcher that matches for Maven archetype catalog only.
 *
 * @since 3.0
 */
public class MavenArchetypeCatalogMatcher
    extends MavenMatcherSupport
{
  private static final String ARCHETYPE_CATALOG_REQ_PATH = "/" + Constants.ARCHETYPE_CATALOG_FILENAME;

  public MavenArchetypeCatalogMatcher(final MavenPathParser mavenPathParser) {
    super(mavenPathParser,
        withHashes((String path) -> path.equals(ARCHETYPE_CATALOG_REQ_PATH))
    );
  }
}
