/*
 * Copyright (c) 2021, Andrew McAdams
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.andmcadams.taskchecker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.runelite.client.ui.ColorScheme;

public class TaskListHeaderPanel extends JPanel
{
	private static final Color COMPLETE = Color.GREEN;
	private static final Color INCOMPLETE = Color.WHITE;

	private final JButton toggleButton;
	private final String name;
	private boolean collapsed;
	private Runnable toggleAction = () -> {
	};

	public TaskListHeaderPanel(String name)
	{
		super();
		this.name = name;
		this.collapsed = false;

		setLayout(new BorderLayout());
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setBackground(ColorScheme.DARKER_GRAY_COLOR);

		toggleButton = new JButton();
		toggleButton.setBorder(new EmptyBorder(8, 10, 8, 10));
		toggleButton.setBackground(ColorScheme.DARKER_GRAY_HOVER_COLOR);
		toggleButton.setForeground(INCOMPLETE);
		toggleButton.setFocusPainted(false);
		toggleButton.setContentAreaFilled(true);
		toggleButton.setHorizontalAlignment(JButton.LEFT);
		toggleButton.addActionListener((event) ->
		{
			collapsed = !collapsed;
			updateButtonText();
			toggleAction.run();
		});

		updateButtonText();
		add(toggleButton, BorderLayout.CENTER);
	}

	public boolean isCollapsed()
	{
		return collapsed;
	}

	public void setCollapsed(boolean collapsed)
	{
		this.collapsed = collapsed;
		updateButtonText();
	}

	public void setComplete(boolean isComplete)
	{
		toggleButton.setForeground(isComplete ? COMPLETE : INCOMPLETE);
	}

	public void setToggleAction(Runnable toggleAction)
	{
		this.toggleAction = toggleAction == null ? () -> {
		} : toggleAction;
	}

	private void updateButtonText()
	{
		String prefix = collapsed ? "[+] " : "[-] ";
		toggleButton.setText(prefix + name);
	}

	@Override
	public Dimension getMaximumSize()
	{
		Dimension preferred = getPreferredSize();
		return new Dimension(Integer.MAX_VALUE, preferred.height);
	}
}
